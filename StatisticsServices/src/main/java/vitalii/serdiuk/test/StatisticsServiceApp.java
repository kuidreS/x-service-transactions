package vitalii.serdiuk.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vitalii.serdiuk.test.client.http.UserHttpClient;
import vitalii.serdiuk.test.model.User;
import vitalii.serdiuk.test.statistics.UserStatistics;

import java.util.List;

@SpringBootApplication
public class StatisticsServiceApp {
        public static void main(String[] args) {
            SpringApplication.run(StatisticsServiceApp.class, args);

            UserHttpClient client = new UserHttpClient();
            List<User> userList = client.getAllUsers("http://localhost:8989/users/all");

            UserStatistics userStatistics = new UserStatistics();
            long count = userStatistics.getAdultUserAmount(userList);
            System.out.println(count);
        }
}
