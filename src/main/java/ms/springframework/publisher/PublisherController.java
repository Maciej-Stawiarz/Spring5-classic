package ms.springframework.publisher;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("publisher")
public class PublisherController {

  private final PublisherRepository publisherRepository;

  public PublisherController(PublisherRepository publisherRepository) {
    this.publisherRepository = publisherRepository;
  }

  @GetMapping
  public ResponseEntity<List<Publisher>> getBooks() {
    return new ResponseEntity<>(
        publisherRepository.findAll(),
        HttpStatus.OK);
  }
}