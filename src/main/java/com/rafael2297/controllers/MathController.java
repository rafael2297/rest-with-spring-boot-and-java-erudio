package com.rafael2297.controllers;


import com.rafael2297.exception.UnsupportedMathOperatinExcepption;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rafael2297.utils.NumberUtils;

@RestController
@RequestMapping("/math")
public class MathController {


    //http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numero1}/{numero2}")
    public Double sum(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) throws Exception {

        if (!NumberUtils.isNumeric(numero1) || !NumberUtils.isNumeric(numero2))
            throw new UnsupportedMathOperatinExcepption("Apenas valores numericos!");
        return NumberUtils.convertToDouble(numero1) + NumberUtils.convertToDouble(numero2);
    }

    //http://localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{numero1}/{numero2}")
    public Double subtraction(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) throws Exception {

        if (!NumberUtils.isNumeric(numero1) || !NumberUtils.isNumeric(numero2))
            throw new UnsupportedMathOperatinExcepption("Apenas valores numericos!");
        return NumberUtils.convertToDouble(numero1) - NumberUtils.convertToDouble(numero2);
    }

    //http://localhost:8080/math/multiplication/3/5
    @RequestMapping("/multiplication/{numero1}/{numero2}")
    public Double multiplication(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) throws Exception {

        if (!NumberUtils.isNumeric(numero1) || !NumberUtils.isNumeric(numero2))
            throw new UnsupportedMathOperatinExcepption("Apenas valores numericos!");
        return NumberUtils.convertToDouble(numero1) * NumberUtils.convertToDouble(numero2);
    }

    //http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{numero1}/{numero2}")
    public Double division(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) throws Exception {

        if (!NumberUtils.isNumeric(numero1) || !NumberUtils.isNumeric(numero2))
            throw new UnsupportedMathOperatinExcepption("Apenas valores numericos!");
        return NumberUtils.convertToDouble(numero1) / NumberUtils.convertToDouble(numero2);
    }

    //http://localhost:8080/math/average/3/5
    @RequestMapping("/average/{numero1}/{numero2}")
    public Double average(@PathVariable("numero1") String numero1, @PathVariable("numero2") String numero2) throws Exception {

        if (!NumberUtils.isNumeric(numero1) || !NumberUtils.isNumeric(numero2))
            throw new UnsupportedMathOperatinExcepption("Apenas valores numericos!");
        return NumberUtils.convertToDouble(numero1) + NumberUtils.convertToDouble(numero2) / 2;
    }

    //http://localhost:8080/math/squareRoot/25
    @RequestMapping("/squareRoot/{numero1}")
    public Double squareRoot(@PathVariable("numero1") String numero1) throws Exception {

        if (!NumberUtils.isNumeric(numero1))
            throw new UnsupportedMathOperatinExcepption("Apenas valores numericos!");
        return Math.sqrt(NumberUtils.convertToDouble(numero1));
    }





}
