package com.project.airsample.controllers.elifFlight;

import com.project.airsample.elifAir.airport.AirPortList;
import com.project.airsample.elifAir.airport.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/elifAir/airport")
    public class ElifAirPortController {
        //crud - create - read - update - delete

        @Autowired
        private Airport elifAirport;

        @Autowired
        //aşağıda özel isimlendirdiğimiz component i çağırdık
        @Qualifier("elifAirPortList")
        private AirPortList elifAirportList;

        @GetMapping("/list")
        public AirPortList getAirports(){
            return elifAirportList;
        }

        @GetMapping("/{id}")
        public Airport getAirport(@RequestParam int id){
            return elifAirport.getById(id);
        }

        @PostMapping("/")
        public boolean saveAirport(@RequestBody Airport airport){
            return elifAirport.insertDb(airport);
        }

        @PutMapping("/")
        public boolean updateAirport(@RequestBody Airport airport){
            return elifAirport.updateDb(airport);
        }


        @DeleteMapping ("/{id}")
        public Airport deleteAirport(@RequestBody int id){
                return elifAirport.deleteDB(id);

    }










//        @Autowired
//        private Airport elifAirport;
//
//        @GetMapping("/")
//        public Airport elifAirport(){
//            return elifAirport;
//        }
//
//        // daha çok bu yöntem kullanılıyor. daha aktif değiştirilebilir. hareket alanı var
//        private Airport elifAirport2;
//
//        //aşağıdaki constructer injection
//        @Autowired
//        public ElifAirPortController(Airport port){
//            elifAirport2 = port;
//        }
//
//        @GetMapping("/airport2")
//        public Airport elifAirport2(){
//            return elifAirport2;
//        }


    }


