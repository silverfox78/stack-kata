import com.nisum.craftsmanship.kata.stack.Stack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class StackTest {
    private Stack stack = new Stack(93);


    @Test
    public void newStackShouldBeEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void whenPushingOneStackIsNotEmpty(){
        stack.push(1);

        assertFalse(stack.isEmpty());
    }

    @Test
    public void whenOneIsPushedOneIsPoppedAndwhenTwoIsPushedTwoIsPopped(){
        stack.push(1);

        assertEquals(1, stack.pop());

        stack.push(2);

        assertEquals(2, stack.pop());
    }

    @Test
    public void whenOneAndTwoArePushedThenTwoAndOneArePopped(){
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void newStackWithSizeIsCreated(){
        Stack stack = new Stack(42);

        assertEquals(42, stack.getCapacity());

        stack = new Stack(73);

        assertEquals(73, stack.getCapacity());
    }

    @Test(expected = Stack.Underflow.class)
    public void whenPoppingEmptyStackThrowsStackUnderflow(){
        stack.pop();
    }

    @Test(expected = Stack.Overflow.class)
    public void whenPushingFullStackThrowsStackOverflow(){
        stack = new Stack(0);

        stack.push(42);
    }
}
