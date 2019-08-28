import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    @Test
    void findMax() {
        assertNull(Finder.findMax(new int[] {}));
        assertNull(Finder.findMax(null));
        assertEquals(4, Finder.findMax(new int[] {1, 2, 3, 4}));
    }

    @Test
    void findMin() {
        assertNull(Finder.findMin(new int[] {}));
        assertNull(Finder.findMin(null));
        assertEquals(1, Finder.findMin(new int[] {1, 2, 3, 4}));
    }
}