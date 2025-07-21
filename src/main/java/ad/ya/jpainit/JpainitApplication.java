package ad.ya.jpainit;

import ad.ya.jpainit.entities.basic.B_Foo;
import ad.ya.jpainit.entities.basic.B_Foo_Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor // Uniquement les attributs "final" ou "@NonNull"
public class JpainitApplication {

	private final B_Foo_Repository repo;

	public static void main(String[] args) {
		SpringApplication.run(JpainitApplication.class, args);
	}

	@EventListener(ApplicationStartedEvent.class)
	public void onStartup() {
		System.out.println("\u001B[36mJpainitApplication.onStartup\u001B[0m");
		repo.save(
				new B_Foo()
						.setStr("Hi")
						.setAnInt(28)
		);
		repo.findById(1L).ifPresent(System.out::println);
		repo.save(
				new B_Foo()
						.setId(1)
						.setStr("HiThere")
						.setAnInt(55)
		);
		repo.findById(1L).ifPresent(System.out::println);
		repo.deleteById(1L);
		System.out.println(repo.findAll().size());
	}
}
