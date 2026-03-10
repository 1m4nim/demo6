package com.example.demo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping; // これが必要
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo6.form.ReviewRegistForm;

@Controller
public class ReviewController {

    // 入力画面を表示（ブラウザでURLを叩くのはGETリクエスト）
    @GetMapping("/show-review-form")
    public String showReviewForm(@ModelAttribute ReviewRegistForm form) {
        return "regist-review";
    }

    // 確認画面から「戻る」ボタンを押した時用
    @PostMapping("/show-review-form-ret")
    public String showReviewFormRet(@ModelAttribute ReviewRegistForm form) {
        return "regist-review";
    }

    // 入力画面から「確認」ボタンを押した時
    @PostMapping("/regist-review")
    public String registacReview(@ModelAttribute ReviewRegistForm form, Model model) {
        model.addAttribute("reviewRegistForm", form);
        return "confirm-regist-review";
    }

    // 確認画面から「登録」ボタンを押した時
    @PostMapping("/confirm-regist-review")
    public String confirmRegistReview(@ModelAttribute ReviewRegistForm form, Model model) {
        model.addAttribute("msg", "レビュー登録が完了しました");
        return "complete-regist-review";
    }
}