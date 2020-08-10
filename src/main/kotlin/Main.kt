import com.google.gson.GsonBuilder

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

fun main() {
    val gson = GsonBuilder().setPrettyPrinting().create()
    val postsJson = gson.toJson(DataSource.createDataSet())

    PrintWriter(FileWriter(File("posts.json"))).also {
        it.println(postsJson)
        it.close()
    }

}