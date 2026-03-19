package Task1;

public class FileRecord {
    private String name;
    private long size;
    private AccessLevel level;

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        else if(obj == null || getClass() != obj.getClass()) {
            return false;
        }

        FileRecord other = (FileRecord) obj;

        return size == other.size &&
                name.equals(other.name) &&
                level ==other.level;
    }
}
