package gray.dev.droidutililty

import android.content.Context
import android.support.v7.app.AlertDialog

object DialogUtils {

    private var dialog: AlertDialog? = null

    /**
     * Normal Alert Dialog to show with message and title
     */
    fun showAlertDialog(context: Context, message: String, title:String?,isCancelable: Boolean) {
        val builder = AlertDialog.Builder(context)
        builder.setMessage(message)
                .setTitle(title)
                .setCancelable(isCancelable)
        builder.setPositiveButton(context.getString(R.string.dialog_ok_txt)) { dialog, _ -> dialog.dismiss() }
        dialog = builder.create()
        dialog!!.show()
    }

    /**
     * Dismiss the alert dialog which is presented
     */
    fun dismissAlertDialog() {
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        }
    }
}