import java.util.Properties;
import java.io.*;

public class FileProperties extends Properties implements FileIO {
  public void readFromFile(final String filename) throws IOException {
    final InputStream stream = new FileInputStream(filename);
    load(stream);
    stream.close();
  }

  public void writeToFile(String filename) throws IOException {
    OutputStream oStream = new FileOutputStream(filename);
    store(oStream, "");
  };

  public void setValue(String key, String value) {
    setProperty(key, value);
  }

  public String getValue(String key) {
    return getProperty(key);
  };
}