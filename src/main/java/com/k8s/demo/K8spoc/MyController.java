package com.k8s.demo.K8spoc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyController {

    @GetMapping("/hello")
    ResponseEntity<Map<String, String>> getMsg() {
        HashMap<String, String> map = new HashMap<>();
        map.put("msg", "Hellow From K8s");
        return ResponseEntity.ok(map);
    }
}
