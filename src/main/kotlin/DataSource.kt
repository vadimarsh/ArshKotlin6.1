import dto.*
import ru.netology.dto.PostTypes
import java.text.SimpleDateFormat

class DataSource {

    companion object {
        fun createDataSet(): ArrayList<Post> {
            val list = ArrayList<Post>()
            list.add(
                Post(
                    0,
                    PostTypes.POSTBASIC,
                    "Вадим Аршинский",
                    "default",
                    "Первый пост!! Привет мир!",
                    SimpleDateFormat("dd-MM-yyyy").parse("15-07-2020")!!,
                    56,
                    100,
                    1
                )
            )
            list.add(
                Post(
                    1,
                    PostTypes.POSTEVENT,
                    "Вадим Аршинский",
                    "default",
                    "На острове Ольхон, который является сакральным центром силы Байкала, расположен мыс Шаманка, который является обиталещем главного бурхана всей территории",
                    SimpleDateFormat("dd-MM-yyyy").parse("17-07-2020")!!,
                    0,
                    0,
                    0,
                    false,
                    false,
                    false,
                    "РФ, Иркутская область, п. Хужир",
                    Location("53.203965", "107.338867")
                )
            )
            list.add(
                Post(
                    2,
                    PostTypes.POSTVIDEO,
                    "Вадим Аршинский",
                    "default",
                    "Мыс Бурхан зимой (кликните на картинку для просмотра)",
                    SimpleDateFormat("dd-MM-yyyy").parse("01-03-2020")!!,
                    3,
                    1,
                    1,
                    true,
                    videoUrl = "https://youtu.be/73syI1uEWsM"
                )
            )
            list.add(
                Post(
                    3,
                    PostTypes.POSTREPOST,
                    "Вадим Аршинский",
                    "default",
                    "Зацените друзья: какой зачётный пост!",
                    SimpleDateFormat("dd-MM-yyyy").parse("20-07-2020")!!,
                    repost = list[0]
                )
            )
            list.add(
                Post(
                    4,
                    PostTypes.POSTPROMO,
                    "Гугл",
                    "https://lh4.googleusercontent.com/-JGT2qEoG5X4/AAAAAAAAAAI/AAAAAAAAHko/fH9KqPJv1Ls/photo.jpg",
                    "Очень полезный сервис!",
                    SimpleDateFormat("dd-MM-yyyy").parse("20-07-2020")!!,
                    promoImgUrl = "http://snow-baikal.tw1.ru/res/lUPAC_blocks_RGB.png",
                    promoUrl = "https://www.google.ru/landing/now/"
                )
            )
            list.add(
                Post(
                    5,
                    PostTypes.POSTREPOST,
                    "Вадим Аршинский",
                    "default",
                    "И еще один зачётный пост!",
                    SimpleDateFormat("dd-MM-yyyy").parse("20-07-2020")!!,
                    repost = list[2]
                )
            )
            return list
        }
    }
}
