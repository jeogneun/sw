package student;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentManagerTest {
	
	StudentManager manager;

	    @BeforeEach
	    void setUp() {
	        manager = new StudentManager();
	    }

	    @Test
	    void testAddStudent() {
	    	manager.addStudent("박정은");
	        assertTrue(manager.hasStudent("박정은"));
	    }

	    @Test
	    void testRemoveStudent() {
	    	manager.addStudent("박정은");
	        manager.removeStudent("박정은");
	        assertFalse(manager.hasStudent("박정은"));
	    }

	    @Test
	    void testAddDuplicate() {
	    	manager.addStudent("박정은");
	        assertThrows(IllegalArgumentException.class, () -> manager.addStudent("박정은"));
	    }

	    @Test
	    void testRemoveNotExist() {
	    	assertThrows(IllegalArgumentException.class, () -> manager.removeStudent("박정은"));
	    }

}
