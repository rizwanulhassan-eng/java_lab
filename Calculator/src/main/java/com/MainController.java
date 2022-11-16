package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

@Controller
public class MainController {

    @Autowired
    CalculatorDao calculatorDao;

    @RequestMapping ("/input")
    public String input(Model model)
    {
        Calculator calculator=new Calculator();
        model.addAttribute("calculator",calculator);

        return "insert";
    }






    @ResponseBody
    @RequestMapping("/save")
    public String save(Model model,Calculator calculator, BindingResult bindingResult)throws SQLException
    {
        if (bindingResult.hasErrors()) {
            return "/input";
        }
        calculator.setResult(calculator.getInput1()+calculator.getInput2());
        System.out.println(calculator);

        calculatorDao.saveIt(calculator);
        return"saved";
    }
    @ResponseBody
    @RequestMapping("/delete")
    public String delete(Model model,Calculator calculator, BindingResult bindingResult)throws SQLException
    {
        if (bindingResult.hasErrors()) {
            return "/input";
        }
        calculator.setResult(calculator.getInput1()-calculator.getInput2());
        System.out.println(calculator);

        calculatorDao.saveIt(calculator);
        return"saved";
    }
    @ResponseBody
    @RequestMapping("/multiplication")
    public String multiplication(Model model,Calculator calculator, BindingResult bindingResult)throws SQLException
    {
        if (bindingResult.hasErrors()) {
            return "/input";
        }
        calculator.setResult(calculator.getInput1()*calculator.getInput2());
        System.out.println(calculator);

        calculatorDao.saveIt(calculator);
        return"saved";
    }
    @ResponseBody
    @RequestMapping("/division")
    public String division(Model model,Calculator calculator, BindingResult bindingResult)throws SQLException
    {
        if (bindingResult.hasErrors()) {
            return "/input";
        }
        calculator.setResult(calculator.getInput1()/calculator.getInput2());
        System.out.println(calculator);

        calculatorDao.saveIt(calculator);
        return"saved";
    }



}
