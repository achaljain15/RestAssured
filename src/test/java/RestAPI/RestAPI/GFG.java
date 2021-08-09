package RestAPI.RestAPI;
// Java Program to Convert Map to JSON to HashMap

// Importing required basic libraries
// Importing required classes from com.fasterxml.jackson
// package
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;

// Main class
// MapToJSONExample
public class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an object of HashMap class
		// Declaring object of String and Object type
		HashMap<String, Object> studentHashmap
			= new HashMap<String, Object>();

		// Let us hold studentHashmap containing
		// 1. studentId
		// 2. studentFirstName
		// 3. studentLastName
		// 4. studentStream
		// 5. studentMarks

		// Custom input entries
		studentHashmap.put("studentId", 1);
		studentHashmap.put("studentFirstName", "AAA");
		studentHashmap.put("studentLastName", "BBB");
		studentHashmap.put("studentStream", "PCMB");
		studentHashmap.put("studentMarks", "480");

		// ObjectMapper object is a reusable object.
		// ObjectMapper is the main essential class in
		// Jackson library which helps for reading and
		// writing JSON, either to and from basic POJOs
		// (Plain Old Java Objects) or from HashMap
		// containing key/value pairs.
		ObjectMapper mapper = new ObjectMapper();

		// Try block to check fo exceptions
		try {

			// Convert studentHashmap to JSON
			// In method writeValueAsString(Object object),
			// we are using this method in the code and that
			// can be used to serialize any Java value as a
			// String. Here we are passing HashMap of data
			// as object and it serializes them as string .
			// As ObjectMapper is used, it writes JSON
			// string
			String studentJson= mapper.writeValueAsString(studentHashmap);

			// Print JSON output
			System.out.println(studentJson);
		}

		// There are possibilities of following exceptions,
		// so catch block to handle the exceptions
		catch (JsonGenerationException e) {

			// Printing the exception along with line number
			// using the printStackTrace() method
			e.printStackTrace();
		}

		// Catch block 2
		catch (JsonMappingException e) {
			e.printStackTrace();
		}

		// Catch block 3
		// Catching generic input output exceptions
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
