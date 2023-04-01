package com.example.phrases;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {
    @GetMapping("/phrase")
    public String randomPhrase() {
        int a = (int) (Math.random() * 10);
        String [] phraseCollection = new String [10];
        phraseCollection[0] = "«Починати завжди варто з того, що сіє сумніви». Борис Стругацький";
        phraseCollection[1] = "«Наука - це організовані знання, мудрість - це організоване життя». Іммануїл Кант";
        phraseCollection[2] = "««Ідіть упевнено у напрямку мрії. Живіть тим життям, яке ви самі собі вигадали». " +
                "Генрі Девід Торо, письменник, мислитель, натураліст";
        phraseCollection[3] = "«Кожен хоче змінити людство, але ніхто не замислюється над тим, як змінити себе». " +
                "Лев Толстой";
        phraseCollection[4] = "«Будь-яка думка подібна до тесту, варто пом'яти її гарненько – все з неї зробиш». " +
                "Іван Тургенєв";
        phraseCollection[5] = "«Світ ділиться на два класи – одні вірять у неймовірне, інші роблять неможливе». " +
                "Оскар Уайльд";
        phraseCollection[6] = "«Єдине щастя в житті - це постійне прагнення вперед». Еміль Золя";
        phraseCollection[7] = "«Виживає не найсильніший, а найсприйнятливіший до змін». Чарльз Дарвін";
        phraseCollection[8] = "«Питання не у тому, хто мені дозволить, а у тому, хто зможе мені заборонити». " +
                "Айн Ренд";
        phraseCollection[9] = "«Або напиши щось варте, або роби щось, про що варто написати». " +
                "Бенджамін Франклін";

        for(int i = 0; i < phraseCollection.length; i++) {
            if(i == a) {
                return "Цитата дня:" + System.lineSeparator() + phraseCollection[i];
            }
        }

        return "";

    }
}
