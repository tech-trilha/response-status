package com.techtrilha.trilhainicial.responsestatus.control;

import com.techtrilha.trilhainicial.responsestatus.model.Remedy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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


}
