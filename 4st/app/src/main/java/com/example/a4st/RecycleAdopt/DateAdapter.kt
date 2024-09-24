import android.graphics.BitmapFactory
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.a4st.Photo
import com.example.a4st.R
import java.io.File

class DateAdapter(private val photoList: List<Photo>) : RecyclerView.Adapter<DateAdapter.PhotoViewHolder>() {

    inner class PhotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView) // Убедитесь, что ID совпадает с вашим layout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_photo, parent, false) // Замените на ваш layout для элемента
        return PhotoViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val photo = photoList[position]
        // Проверьте путь к изображению
        val bitmap = BitmapFactory.decodeFile(photo.uri) // Здесь `uri` должен быть путем к изображению
        if (bitmap != null) {
            holder.imageView.setImageBitmap(bitmap)
        } else {
            // Логирование для отладки
            Log.e("DateAdapter", "Не удалось загрузить изображение: ${photo.uri}")
        }
    }

    override fun getItemCount(): Int {
        return photoList.size
    }
}
