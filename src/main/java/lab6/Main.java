package lab6;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import java.io.IOException;

public class Main {

    public static final String WORKER = "worker";
    public static final String STUDENT = "student";
    public static final String PERSONAL_DATA = "Personal data";
    public static final String PROFESSIONAL_DATA = "Professional data";
    public static final String EDUCATION_DATA = "Education data";
    public static final String NAME = "name";
    public static final String AGE = "age";
    public static final String POSITION = "position";
    public static final String SALARY = "salary";
    public static final String AVERAGE_GRADE = "average grade";
    public static final String BEST_SUBJECT = "best subject";
    public static final String[] FAMILIES_OF_WORKER = {PERSONAL_DATA, PROFESSIONAL_DATA};
    public static final String[] FAMILIES_OF_STUDENT = {PERSONAL_DATA, EDUCATION_DATA};

    public static void main(String[] args) {
        Configuration config = HBaseConfiguration.create();
        try (Connection connection = ConnectionFactory.createConnection(config)) {

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
