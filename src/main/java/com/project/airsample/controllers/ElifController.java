package com.project.airsample.controllers;


import com.project.airsample.elifAir.IAdvantageProgram;
import com.project.airsample.elifAir.TicketRelated.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/<companyName>")
@RestController
@RequestMapping("/elifAir")
public class ElifController {


    // sadece görmemizi sağlıyor. değişiklik yapamıyoruz
    @Autowired
    private Airport elifAirport;

    @GetMapping("/airport/")
    public Airport elifAirport(){
        return elifAirport;
    }

    // daha çok bu yöntem kullanılıyor. daha aktif değiştirilebilir. hareket alanı var
    private Airport elifAirport2;

    //aşağıdaki constructer injection
    @Autowired
    public ElifController(Airport port){
        elifAirport2 = port;
    }

    @GetMapping("/airport2")
    public Airport elifAirport2(){
        return elifAirport2;
    }


    @GetMapping("/")
    public String Starter(){
        return  "elif controller";
    }



    @Autowired
    @Qualifier("elifHuman")
    private IAdvantageProgram object;

    @GetMapping("/program")
    public IAdvantageProgram Program(){
        this.object.counter();

        return this.object;
    }





}
