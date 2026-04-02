package Problem4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class TemperatureSensor {
    private static final String FILE_NAME = "Practice 5/Problem4/sensor.bin";
    private static final int RECORD_COUNT = 60;
    private static final int PATCH_INDEX = 29;
    private static final double PATCH_VALUE = 999.9;

    public static void main(String[] args) {
        writeSensorData();
        patchSensorData();
        readAndAnalyzeData();
    }

    private static void writeSensorData() {
        Random random = new Random();

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            for (int i = 0; i < RECORD_COUNT; i++) {
                double temperature = 15.0 + (20.0 * random.nextDouble());
                outputStream.writeDouble(temperature);
            }
            System.out.println("60 temperature values were written to sensor.bin.");
        } catch (IOException e) {
            System.out.println("Could not write sensor data.");
        }
    }

    private static void patchSensorData() {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(FILE_NAME, "rw")) {
            randomAccessFile.seek(PATCH_INDEX * 8L);
            randomAccessFile.writeDouble(PATCH_VALUE);
            System.out.println("Record 30 was updated to 999.9.");
        } catch (IOException e) {
            System.out.println("Could not patch sensor data.");
        }
    }

    private static void readAndAnalyzeData() {
        double sum = 0.0;
        double max = Double.NEGATIVE_INFINITY;
        int count = 0;

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                double temperature = inputStream.readDouble();
                sum += temperature;
                max = Math.max(max, temperature);
                count++;
            }
        } catch (EOFException e) {
            if (count > 0) {
                double average = sum / count;
                System.out.printf("Average temperature: %.2f%n", average);
                System.out.printf("Max temperature: %.1f%n", max);
            }
        } catch (IOException e) {
            System.out.println("Could not read sensor data.");
        }
    }
}
