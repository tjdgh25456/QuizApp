package com.app.myquizapp

object Constants {


    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "어느 나라 국기인가요?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Austrialia",
            "Armenia", "Austria",
            1


        )
        questionsList.add(que1)

        //2
        val que2 = Question(
            2, "어느 나라 국기인가요?",
            R.drawable.ic_flag_of_australia,
            "australila", "auostralia",
            "australia", "australilia",
            3
        )
        questionsList.add(que2)

        //3
        val que3 = Question(
            3, "어느 나라 국기인가요?",
            R.drawable.ic_flag_of_belgium,
            "belgium", "Austrialia",
            "belgiumum", "belkium",
            1
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "어느 나라 국기인가요?",
            R.drawable.ic_flag_of_brazil,
            "Abrazil", "brazilia",
            "brazil", "barazil",
            3


        )
        questionsList.add(que4)

        //5
        val que5 = Question(
            5, "어느 나라 국기인가요?",
            R.drawable.ic_flag_of_denmark,
            "denmark3", "benmark",
            "denmarking", "denmark",
            4


        )
        questionsList.add(que5)

        //6
        val que6 = Question(
            6, "어느 나라 국기인가요?",
            R.drawable.ic_flag_of_fiji,
            "easy", "fiji",
            "filji", "tiji",
            2


        )
        questionsList.add(que6)

        //7
        val que7 = Question(
            7, "어느 나라 국기인가요?",
            R.drawable.ic_flag_of_germany,
            "germany", "gervery",
            "gelmany", "zermany",
            1


        )
        questionsList.add(que7)

        //8
        val que8 = Question(
            8, "어느 나라 국기인가요?",
            R.drawable.ic_flag_of_india,
            "indigo", "indian",
            "indiana", "india",
            4


        )
        questionsList.add(que8)

        //9
        val que9 = Question(
            9, "어느 나라 국기 인가요?",
            R.drawable.ic_flag_of_kuwait,
            "kungwait", "kuguwait",
            "kuwait", "kuwaite",
            3


        )
        questionsList.add(que9)


        val que10 = Question(
            10, "어느 나라 국기인가요?",
            R.drawable.ic_flag_of_new_zealand,
            "now_zealand", "new_gealand",
            "no_zealand", "new_zealand",
            4


        )
        questionsList.add(que10)

        return questionsList


    }

}