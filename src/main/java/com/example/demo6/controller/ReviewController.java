package com.example.demo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping; // 追加が必要
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo6.form.ReviewRegistForm;

@Controller
public class ReviewController {

    @GetMapping("/show-review-form")
    public String showReviewForm(@ModelAttribute ReviewRegistForm form) {
        return "regist-review";
    }


    @PostMapping("/show-review-form-ret")
    public String showReviewFormRet(@ModelAttribute ReviewRegistForm form) {
        return "regist-review";
    }

    @PostMapping("/regist-review")
    public String registReview(@ModelAttribute ReviewRegistForm form, Model model) {
        // 確認画面で値を表示するために Model に追加
        model.addAttribute("reviewRegistForm", form);
        return "confirm-regist-review";
    }

    @PostMapping("/confirm-regist-review")
    public String confirmRegistReview(@ModelAttribute ReviewRegistForm form, Model model) {
        // @ModelAttribute を付けることで、完了画面でもデータを使えるようにする
        model.addAttribute("msg", "レビュー登録が完了しました");
        return "complete-regist-review";
    }
}