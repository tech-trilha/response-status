package com.techtrilha.trilhainicial.responsestatus.control;

import com.techtrilha.trilhainicial.responsestatus.model.Remedy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.net.URI;

@RestController
public class RemedyController {

  @GetMapping("/remedies/{id}")
  public ResponseEntity<Object> getRemedy(@PathVariable("id") Long id) {
    if (id == 1) {
      final var remedy = new Remedy();
      remedy.setId(1L);
      remedy.setName("Xarope");
      remedy.setDescription("Para tosse ou irritacao");
      return ResponseEntity.ok(remedy);
    }
    return ResponseEntity.notFound().build();
  }

  @PostMapping("/remedies")
  public ResponseEntity<Remedy> generateRemedy(@RequestBody Remedy remedy) {
    remedy.setId(1L);
    return ResponseEntity
        .created(URI.create("/remedies/" + remedy.getId()))
        .body(remedy);
  }

}
