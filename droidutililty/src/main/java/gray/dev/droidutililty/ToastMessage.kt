package gray.dev.droidutililty

import android.content.Context
import android.widget.Toast

object ToastMessage {

    /**
     * Simple toast function to call
     */
    fun toast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}