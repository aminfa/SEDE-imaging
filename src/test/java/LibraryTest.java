/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import Catalano.Imaging.Filters.Crop;
import Catalano.Imaging.Filters.Resize;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Crop c = new Crop(1,1,1,1);
        Resize resize = new Resize(1,1);
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
