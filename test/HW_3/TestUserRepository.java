package HW_3;

import org.junit.jupiter.api.Test;
import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUserRepository {
    @Test
    public void testLogoutUser() {
        User first = new User("Ivan", "admin111###", true);
        first.authenticate("Ivan", "admin111###");
        User second = new User("Sergey", "admin222$$$", false);
        second.authenticate("Sergey", "admin222$$$");
        User third = new User("Petr", "admin333%%%", false);
        third.authenticate("Petr", "admin333%%%");

        UserRepository userRepository = new UserRepository();

        userRepository.addUser(first);
        userRepository.addUser(second);
        userRepository.addUser(third);

        userRepository.logoutUser();

        assertThat(userRepository.getData().get(0)).isEqualTo(first);
    }
}