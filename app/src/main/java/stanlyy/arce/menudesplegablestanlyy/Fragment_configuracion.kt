package stanlyy.arce.menudesplegablestanlyy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class Fragment_configuracion : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_configuracion, container, false)


        val btn_ingresar = root.findViewById<Button>(R.id.btn_ingresar)
        btn_ingresar.setOnClickListener {
            Toast.makeText(context,"Hola mundo",Toast.LENGTH_LONG).show()
        }

        return root
    }


}