package dev.leah.hacks;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/hacks")
public class HackController {
  @Autowired
  private HackService hackService;
  
  @GetMapping
  public ResponseEntity<List<Hack>> getAllHacks() {
    return new ResponseEntity<>(hackService.allHacks(), HttpStatus.OK);
  }
  
  @GetMapping("/{hackId}")
  public ResponseEntity<Optional<Hack>> getSingleHack(@PathVariable String hackId) {
    return new ResponseEntity<>(hackService.singleHack(hackId), HttpStatus.OK);
  }
}
