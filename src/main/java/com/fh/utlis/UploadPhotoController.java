package com.fh.utlis;

import com.fh.utlis.result.CommonsReturn;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/uploadPhoto")
@CrossOrigin
public class UploadPhotoController {

    @PostMapping
    public CommonsReturn uploadPhoto(@RequestParam("file") MultipartFile file) throws IOException {
            String url = OssUtil.uploadPhoto("user",file);
            return CommonsReturn.success(url);
    }
}
