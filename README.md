NOTA: Cada Commit corresponde a un punto del ejercicio.

NOTA: Cada punto tiene un valor de 1 excepto 5-Algoritmo y 6-RecyclerView que valen 2.

NOTA: Este examen es más complicado de resolver dado que muchos ejercicios se piden sobre un Fragment (Tab1) en lugar de sobre una Antividad.

### Aplicaciones Móviles

### Grado en Tecnologías Interactivas (2º cuatr. A)  Universidad Politécnica de Valencia

# Examen de Final Practico  (A)

### Alumno: _______________________ Hora inicio: ______ entrega: ______   Fecha: 13/12/2022

**ADVERTENCIA:** Puede consultarse cualquier tipo de información propia o disponible a través de Internet. No obstante, queda terminantemente prohibido la comunicación con cualquier persona durante la realización del examen. El envío o recepción de correos electrónicos, WhatsApp, compartición de ficheros, uso de redes sociales, etc. supondrá el suspenso automático de la asignatura.

**DESCRIPCIÓN:** Dispones de un máximo de dos horas y diez minutos para realizar el mayor número de pasos y entregar el resultado en una tarea de Poliformat. Las instrucciones de entrega se indican al final:

**0.**	Crea un nuevo proyecto con los siguientes datos (reemplaza usuario_upv por tu usuario):
```
Project: Phone and Tablet / Empty Activity
Name: Examen apellido
Package name: com.example.apellido.examen
```

**1. Tabs**	El Layout principal ha de mostrar un TextView con tu nombre completo, centrado en la parte superior. Justo debajo, ocupando toda la pantalla, dos pestañas para mostrar dos contenidos diferentes.

**2. Layout** En la primera pestaña se mostrará un layout igual al siguiente:


![imagen del layout](https://raw.githubusercontent.com/jesus-tomas-girones/Examen_AppMoviles_2022/master/layout.png)

•	Por defecto, las vistas se separan del borde y entre si 16 dp.

•	La imagen ha de ser de naranjas, estar pegada a la parte superior izquierda. Su ancho ha de ser igual a B1 y su alto calcularse para mantener la relación de aspecto.

•	El EditText se ajusta verticalmente se ajusta a la base del texto del “Número”.

•	Los tres botones han de ocupar todo el ancho disponible y tener una separación horizontal de 16dp entre ellos y con los márgenes.

•	Ha de verse de forma correcta en vertical y en horizontal y en cualquier dispositivo.


**3. Vistas**	Al pulsar sobre el botón “B1” su texto mostrará la raíz cuadrada del valor introducido en el EditText. Si no resulta posible se mostrará “ERROR”.

**4. Java** Una clasificadora de naranjas han recogido los siguientes datos:

```
static List<Integer> MINUTOS=Arrays.asList( 0,   5,   7,   10,    17,  22,  30,  45,  50);
static List<String> VARIEDAD=Arrays.asList( "valencia",  "navel", "valencia", "clementina",
                                            "navel",  "valencia", "clementina", "valencia" );
static List<Double> DIAMETRO=Arrays.asList( 8.0, 9.0, 7.0, 3.0,   6.0, 9.0, 4.0, 6.0);
```
La lista MINUTOS representa el minuto en el que entra una variedad, esta variedad será procesada hasta que entre una nueva variedad. Sabiendo el instante en que entra una nueva variedad podrás calcular el periodo en que se procesó la variedad. Observa como esta lista tiene un valor más, para poder obtener el periodo de la última variedad. VARIEDAD es el tipo de naranja y DIAMETRO indica el calibre medio en cm de las naranjas procesadas.

a) Crea una clase POJO con las propiedades necesarias para recoger la entrada de una nueva variedad, según las listas anteriores. Ha de tener un constructor que inicialice todas las propiedades y el método toString().

b) Crea un método dentro de la clase POJO que reciba como parámetro tres listas como las que hemos creado. El método debe devolver en una lista, con tantos objetos de la clase POJO, como elementos haya en las listas. Ojo, en MINUTOS hay un elemento más. Llama a este método desde MainActivity y muestra el resultado en el LogCat.

**5. Algoritmo** a) Muestra en un LogCat desde MainActivity los tipos de naranja procesados. (Solución [navel,clementina,valencia]).

b) Crea en una variable Map<> donde, para cada tipo de naranja se indique el número total de naranjas procesadas, sabiendo que la máquina procesa 100 naranjas/minuto. Muestra la solución en un LogCat. {navel=700, clementina=2200, valencia=2100}.

c) Muestra el volumen de zumo que podemos obtener de cada variedad.   solución: {navel=132641.9, clementina=60157.9, valencia=549449.6}

**6. RecyclerView**	En la segunda pestaña se mostrará un RecyclerView. Este ha de mostrar toda la información contenida en la lista de POJOS creada en el apartado 4.b. Si dispones de tiempo puedes hacer este apartado junto al siguiente.

**7. Imágenes en RecyclerView**	Busca en Internet dos fotos de naranjas. Añádelos como recursos al proyecto. Haz que una foto aparezca en cada elemento de RecycerView, cuando su diámetro es <=7. En caso contrario se mostrará la otra foto.

**8. Geolocalización**	Haz que el dispositivo muestre su posición en los TextView Long y Lat cada 2 minutos. Al salir de la aplicación se dejará de recibir actualizaciones y se mostrará un Log indicándolo.

**9. Receptor anuncio**	Cuando el dispositivo sea desconectado de la alimentación, haz que cambie el color del botón 3.

**10. Guardar estado**	Al girar el teléfono toda la información mostrada que muestra el Layout de la figura permanecerá igual.  Nota: Necesario haber hecho antes el punto 3 o 9.

### Entrega de la práctica:

11. Verifica que todo funciona perfectamente antes de realizar el siguiente punto.

12. Selecciona la opción Build / Build Bundel(s) APK(s) / Build APK. Así generamos el apk.

13. Selecciona la opción File / Export to Zip file... para guardar el código del proyecto.

14. Para entregarla utiliza la opción Tareas del menú de poli[Format]. Adjunta los dos ficheros.

15. Copia en el cuadro de texto, el código realizado en los puntos 4 y 5. Envía la tarea.

16. Para facilitar la corrección, marca en esta hoja con una X, los ejercicios que has realizado. Añade los comentarios oportunos:

´´´
(_)	1.-Tab
(_)	2.-Layout
(_) 3.-Propiedades vistas
(_)	4.-Java
(_)	5.-Algoritmo
(_)	6.-RecyclerView
(_)	7.-Imágenes en RecyclerView
(_)	8.-Geolocalización
(_)	9.-Receptor anuncio
(_) 10.-Guardar estado

´´´
16.	Ejecuta el proyecto en un terminal o emulador y avisa al profesor para que lo evalúe.
