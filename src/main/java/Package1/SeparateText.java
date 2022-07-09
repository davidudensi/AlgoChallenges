/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class SeparateText {

    public List<String> separate(String text, int max) {
        List<String> result = new ArrayList<>();
        String[] string_array = text.split(" ");
        int char_count = 0;
        StringBuilder current = new StringBuilder();
        for (String word : string_array) {
            if (char_count + word.length() >= max) {
                result.add(current.toString());
                current = new StringBuilder();
                current.append(word).append(" ");
                char_count = word.length() + 1;
            } else {
                current.append(word).append(" ");
                char_count += word.length() + 1;
            }
        }
        result.add(current.toString());
        return result;
    }

    public static void main(String[] args) {
        String input = "All of the fields on this page are optional and can be "
                + "deleted at any time and by filling them out you're giving "
                + "us consent to share this data wherever your user profile "
                + "appears. Please see our privacy statement to learn more "
                + "about how we use this information.";
        SeparateText separateText = new SeparateText();
        System.out.println(separateText.separate(input, 20));
    }
}
