package date.time;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	LocalDateTime current = LocalDateTime.now();

        System.out.println("Current Date and Time is: " + current);
    }
}
