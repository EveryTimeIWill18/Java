package hbc;
import javax.xml.ws.http.HTTPException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.net.*;
import java.io.IOError;
import java.io.IOException;
import java.io.EOFException;
import java.nio.*;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;

/*
  Example code makes a GET request and splits text by ","
  the text is then placed in a DataFrame like structure.
*/



public class Main {

    public static void main(String[] args) {

        String url_str = "https://assets.datacamp.com/production/course_1761/datasets/stocks.csv";
        try {
            URL url = new URL(url_str);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            int status = connection.getResponseCode();

            if(status == 200) {
                System.out.println("Successfully connected to url. Status code: " + status);

                // create a stream buffer to read in the data
                BufferedReader stream = new BufferedReader(
                        new InputStreamReader(connection.getInputStream())
                );
                ArrayList<List<String>> data_container = new ArrayList<List<String>>();
                String current_row;
                int row_counter = 0;
                while((current_row = stream.readLine()) != null) {
                    String[] temp;
                    temp = current_row.split(",");
                    List<String> l = new ArrayList<String>();
                    l = Arrays.asList(temp);
                    data_container.add(l);
                    row_counter += 1;
                }
                System.out.println("Number of lines read: " + row_counter);
                for(int i=0; i < data_container.size(); i++) {
                    System.out.println(data_container.get(i));
                }

            } else {
                System.err.println("Failed to make a connection");
                throw new HTTPException(404);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
