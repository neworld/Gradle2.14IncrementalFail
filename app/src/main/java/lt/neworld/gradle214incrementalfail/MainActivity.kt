package lt.neworld.gradle214incrementalfail

import android.os.Bundle
import android.os.Parcelable
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import lt.neworld.entities.User
import org.parceler.Parcels

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User("Foo", "Bar", 24)
        val parceled = Parcels.wrap(user)
        showParceled(parceled)
    }

    private fun showParceled(parceled: Parcelable) {
        val user = Parcels.unwrap<User>(parceled)
        Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show()
    }
}
