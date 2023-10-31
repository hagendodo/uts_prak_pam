package pam.tugas.uts_prak_pam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_menu)

        val intent = intent
        val selectedStore: String? = intent.getStringExtra("selectedStore")
        val customerName: String? = intent.getStringExtra("customerName")
        val menuName: String? = intent.getStringExtra("menuName")

        val btnOrder: Button = findViewById(R.id.btn_order_menu)
        val btnBack: Button = findViewById(R.id.btn_back_menu)

        btnOrder.setOnClickListener{
            val intent = Intent(this, OrderDetailActivity::class.java)
            intent.putExtra("selectedStore", selectedStore.toString())
            intent.putExtra("customerName", customerName.toString())
            intent.putExtra("selectedMenu", menuName.toString())
            startActivity(intent)
        }

        btnBack.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            intent.putExtra("selectedStore", selectedStore.toString())
            intent.putExtra("customerName", customerName.toString())
            startActivity(intent)
        }
    }
}