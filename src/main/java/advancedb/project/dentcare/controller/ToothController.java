package advancedb.project.dentcare.controller;

import advancedb.project.dentcare.domain.Tooth;
import advancedb.project.dentcare.service.ToothService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("teeth")
@RequiredArgsConstructor
public class ToothController {
    private final ToothService toothService;
    @GetMapping
    public ResponseEntity<List<Tooth>> findAll(){
        return ResponseEntity.ok(toothService.findAll());
    }

}
