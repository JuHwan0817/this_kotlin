package net.juhwan203.thisiskotlin.firebasechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import model.Room
import net.juhwan203.thisiskotlin.firebasechat.databinding.ActivityMainBinding

class ChatListActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    val database = Firebase.database("https://this-is-android-with-kot-8880d-default-rtdb.asia-southeast1.firebasedatabase.app/")
    val roomsRef = database.getReference("rooms")
    companion object {
        var userId:String = ""
        var userName:String = ""
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        userId = intent.getStringExtra("userId") ?: "none"
        userName = intent.getStringExtra("userName") ?: "Anonymous"

        with(binding){
            btnCreate.setOnClickListener{openCreateRoom()}
        }
    }
    fun openCreateRoom(){
        // 1.
        val editTitle = EditText(this)
        // 2.
        val dialog = AlertDialog.Builder(this)
            .setTitle("방 이름")
            .setView(editTitle)
            .setPositiveButton("만들기"){dlg, id ->
                createRoom(editTitle.text.toString())
            }
        dialog.show()
    }
    fun createRoom(title:String){
        val room = Room(title, userName)
        val roomId = roomsRef.push().key!!
        room.id = roomId
        roomsRef.child(roomId).setValue(room)
    }
}

















