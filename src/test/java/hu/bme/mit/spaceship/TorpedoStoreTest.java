package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }
    @Test
    void checkCount() {
        // Arrange
        TorpedoStore store = new TorpedoStore(3);
        // Act
        // Assert
        assertEquals(3, store.getTorpedoCount());
        assertEquals(true, store.fire(2));
        assertEquals(1, store.getTorpedoCount());
        assertEquals(true, store.fire(1));
        assertEquals(0, store.getTorpedoCount());
        assertThrows(IllegalArgumentException.class, () -> { store.fire(2); });
    }
}
