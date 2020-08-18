import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
    static List<String> subPathList;

    public  void navigateToDirectory() throws IOException {
        Path path = Paths.get("C:\\Users\\segala628\\Documents\\SolrEntityLinStationIncr\\SolrEntityLinStationIncr");
        try (Stream<Path> subPath = Files.walk(path)) {
            subPathList = subPath.filter(Files::isRegularFile).map(Objects::toString).collect(Collectors.toList());
            System.out.println(subPathList);
        }

    }

    public void getElementsFromList(int indexNumberToList)
    {
        subPathList.get(indexNumberToList);

    }

    public static void main(String[] args) throws IOException {
  TestClass obj = new TestClass();
  obj.navigateToDirectory();

    }
}

