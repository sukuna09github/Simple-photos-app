package soumyajit.example.soumyajit.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
import soumyajit.example.soumyajit.model.Photo;
import soumyajit.example.soumyajit.service.PhotozService;


import java.io.IOException;
import java.util.Collection;

@RestController
public class PhotozController {

    private final PhotozService photozService;

    public PhotozController(PhotozService photozService) {
        this.photozService = photozService;
    }

    @GetMapping("/")
    public String hello()
    {
        return "Hello World";

    }

    @GetMapping("/photoz")
    public Iterable<Photo> get() {

        return photozService.get();
    }

    @GetMapping("/photoz/{id}")
    public Photo get(@PathVariable Integer id) {
        Photo photo = photozService.get(id);
        if(photo == null)throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return photo;

    }
    @DeleteMapping("/photoz/{id}")
    public void delete(@PathVariable Integer id) {
       photozService.remove(id);
    }

    @PostMapping("/photoz")
    public Photo create(@RequestPart("data") MultipartFile file) throws IOException {
        Photo photo  = photozService.save(file.getOriginalFilename(), file.getContentType(), file.getBytes());
        return photozService.save(file.getOriginalFilename(), file.getContentType(), file.getBytes());
    }
}
