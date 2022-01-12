package com.example.wu.web

import com.example.wu.entity.Book
import com.example.wu.service.BookService
import net.coobird.thumbnailator.Thumbnails
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream
import java.util.*

@RestController
class BookController(
    private val bookService: BookService) {

    @GetMapping("/book")
    fun getBookByName(name: String): ResponseEntity<Book> {
        var book = bookService.findByName(name)
        return ResponseEntity.ok(book)
    }

    @PostMapping("/book")
    fun saveBook(name: String, edition: Int) {
        bookService.saveBook(Book(null, name,edition))
    }

    //这里文件的大小有限制，默认值是1M，如果要修改，课已在properties文件中设置spring.servlet.multipart.max-file-size=100MB，这个表示限制单个文件小于100M
    //spring.servlet.multipart.max-request-size=200MB这个设置每次请求的文件的大小限制
    @PostMapping("/img")
    fun uploadImg(@RequestPart img: MultipartFile) :String {
        var size = img.bytes.size
        var size1 = img.size
        if(size > 1024 * 1024) {
            val out = ByteArrayOutputStream()
            //这种可以指定高度和宽度设置大小，也可以直接按照一定的比例来缩放
            //Thumbnails.of(img.inputStream).size(1000, 1000).toOutputStream(out) 15813
            Thumbnails.of(img.inputStream).scale(0.25).toOutputStream(out)
            var size2 = out.size()
            println(size2)
            //把缩放后的图片使用base65进行转换成字符串，并存入到文件中
            var encodeToString = Base64.getEncoder().encodeToString(out.toByteArray())
            var file = File("aa.txt")
            var stream = FileOutputStream(file)
            stream.write(encodeToString.toByteArray())
            stream.flush()
            stream.close()
        }
        return "success"
    }

}