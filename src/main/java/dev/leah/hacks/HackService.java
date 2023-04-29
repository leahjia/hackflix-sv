package dev.leah.hacks;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HackService {
  @Autowired
  private HackRepository hackRepository;
  
  public List<Hack> allHacks() {
    return hackRepository.findAll();
  }
  
  public Optional<Hack> singleHack(String hackId) {
    return hackRepository.findHackByHackId(hackId);
  }
}
