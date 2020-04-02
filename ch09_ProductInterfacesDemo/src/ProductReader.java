
public interface ProductReader {
	Product get(String code);
	String getAll(); //public abstract is implied - don't need to type it 
}
