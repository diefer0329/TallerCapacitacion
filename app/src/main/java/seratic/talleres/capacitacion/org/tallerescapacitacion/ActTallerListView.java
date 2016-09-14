package seratic.talleres.capacitacion.org.tallerescapacitacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import seratic.talleres.capacitacion.org.tallerescapacitacion.adapter.ListAdapter;
import seratic.talleres.capacitacion.org.tallerescapacitacion.model.PeliculasVO;

public class ActTallerListView extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private ListView lvPeliculas;
    private List<PeliculasVO> peliculasVOList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ly_act_taller_list_view);
        lvPeliculas = (ListView) findViewById(R.id.lv_pelis);
        //llenarLista();

        //ListAdapter adapter = new ListAdapter(ActTallerListView.this,peliculasVOList);
        //lvPeliculas.setAdapter(adapter);
        //lvPeliculas.setOnItemClickListener(this);

    }

    private void llenarLista() {
        peliculasVOList = new ArrayList<PeliculasVO>();
        peliculasVOList.add(new PeliculasVO("DEADPOOL", "Basada en el antihéroe más carismático de los cómics de Marvel, 'Deadpool' relata la historia de Wade Wilson, un antiguo operativo de las fuerzas especiales convertido en mercenario. Tras ser el sujeto de un experimento que le otorga el poder de curación acelerada, adopta el alter ego de Deadpool. Armado con sus nuevas habilidades y un retorcido sentido del humor, se propone dar caza al hombre que casi destruye su vida.", "FEBRERO 12 DE 2016", "http://s3.foxmovies.com/foxmovies/production/films/103/images/featured_content/111-front.jpg"));
        peliculasVOList.add(new PeliculasVO("CAPITÁN AMÉRICA: CIVIL WAR", "'Captain America: Civil War' de Marvel empieza donde lo dejó \"Los Vengadores: La Era de Ultrón\" ya que Steve Rogers lidera el nuevo equipo de los Vengadores en su incesante tarea de proteger a la humanidad. Después de que otro incidente internacional en el que se ven envueltos los Vengadores produzca daños colaterales, la presión política obliga a poner en marcha un sistema para depurar responsabilidades y un organismo rector que determine cuándo hay que recurrir a los servicios del equipo. El nuevo statu quo divide a los Vengadores mientras intentan proteger al mundo de un nuevo malvado.", "SEPTIEMBRE 14 DE 2016", "http://www.elmulticine.com/imagenes/noticias/14/capi-america-3-pic33s.jpg"));
        peliculasVOList.add(new PeliculasVO("ESCUADRÓN SUICIDA", "Qué bien sienta ser malo... Reúne a un equipo con los más peligrosos y encarcelados Súper Villanos, pon a su disposición el arsenal más poderoso del gobierno, y envíalos a una misión para derrotar a un ente enigmático e invencible. La oficial de inteligencia de EE.UU. Amanda Waller ha creado un grupo secreto que reúne a individuos diversos y despreciables que no tienen nada que perder, y que servirán perfectamente para la misión. Sin embargo, una vez se dan cuenta de que no habían sido escogidos para triunfar, sino por su evidente culpabilidad cuando fracasen de forma inevitable, ¿decidirá el Escuadrón Suicida morir en el intento o será un sálvense quien pueda ?", "AGOSTO 05 DE 2016", "http://www.suicidesquad.com/assets/images/gallery/13.jpg"));
        peliculasVOList.add(new PeliculasVO("LA QUINTA OLA", "En La Quinta Ola, cuya trama ocurre en la actualidad, cuatro oleadas de ataques mortales han devastado la mayor parte de la Tierra. Con este escenario de miedo y desconfianza como telón de fondo, Cassie, una adolescente de 16 años, se encuentra a la fuga tratando de salvar desesperadamente a su hermano pequeño. Mientras se prepara para la llegada de la inevitable y letal quinta ola, Cassie conoce a un joven que podría convertirse en su última esperanza.", "ENERO 22 DE 2016", "http://www.jerecho.org/wp-content/uploads/2016/03/here-s-why-you-need-to-see-the-5th-wave-where-do-we-go-from-here-803764.jpg"));
        peliculasVOList.add(new PeliculasVO("STAR TREK: MAS ALLA", "La nave insignia de la Flota Estelar, volverá a surcar el universo para asegurarse de la protección de la Tierra y del resto de planetas aliados, en nombre de la Federación Unida de Planetas. Pero la tranquilidad durará poco y el peligro les acechará. Una vez más, deberán usar todo su potencial y recursos para resolver los desafíos a los que se enfrentarán. La travesía de vigilancia pronto se convertirá en una carrera por la supervivencia espacial y la preservación de la armonía entre especies. La tripulación deberá interponerse entre los crueles planes de su enemigo y el futuro de la raza humana.", "JULIO 22 DE 2016", "http://es.web.img3.acsta.net/pictures/16/05/31/12/10/484383.jpg"));
        peliculasVOList.add(new PeliculasVO("BEN-HUR", "La historia gira en torno a un noble que, acusado falsamente, sobrevive a largos años de esclavitud para vengarse de su mejor amigo que le traicionó. Ambos tendrán que elegir entre el castigo y el perdón.", "AGOSTO 19 DE 2016", "http://www.indiewire.com/wp-content/uploads/2016/08/benhur2016movie-wide.jpg"));
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(ActTallerListView.this, peliculasVOList.get(position).getNombre() , Toast.LENGTH_SHORT).show();
    }
}
