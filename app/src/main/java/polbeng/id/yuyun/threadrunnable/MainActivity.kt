package polbeng.id.yuyun.threadrunnable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnKlik.setOnClickListener{
            val runnable = Worker()
            val thread = Thread(runnable)
            thread.start()
        }
    }

    inner class Worker : Runnable{
        override fun run() {
            killsomeTime()
        }
    }

    private fun killsomeTime(){
            for (i in 1..20){
                Thread.sleep(1000)
                println("i: $i")
            }
        }
    }
