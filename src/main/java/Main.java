import Engine.*;
import Engine.Object;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;
import static org.lwjgl.glfw.GLFW.*;


public class Main {

    private Window window = new Window(1920, 1080, "Hello World");

    private ArrayList<Object> objects = new ArrayList<>();
    private ArrayList<Object> objectsRectangle = new ArrayList<>();
    private List<Vector3f> circle = new ArrayList<>();
    private ArrayList<Rectangle> stars = new ArrayList<>();
    MouseInput mouseInput;

    private ArrayList<Object> objectsPointsControl = new ArrayList<>();
    private Object controlLine;
    private ArrayList<Object> curves = new ArrayList<>();
    private ArrayList<Vector3f> center = new ArrayList<>();
    private ArrayList<Sphere> planets = new ArrayList<>();
    Sphere kotak;

    //Yuandi
    private ArrayList<Sphere> kepala = new ArrayList<>();
    private ArrayList<Sphere> badan = new ArrayList<>();
    private ArrayList<Sphere> kaki = new ArrayList<>();
    private ArrayList<Sphere> tangan = new ArrayList<>();
    private ArrayList<Sphere> topi = new ArrayList<>();
    private ArrayList<Object> kumis = new ArrayList<>();
    private ArrayList<Object> doraemon = new ArrayList<>();
    boolean check = true;

    //Timothy
    private ArrayList<Sphere> kepala1 = new ArrayList<>();
    private ArrayList<Sphere> badan1 = new ArrayList<>();
    private ArrayList<Sphere> kaki1 = new ArrayList<>();
    private ArrayList<Sphere> tangan1 = new ArrayList<>();
    private ArrayList<Sphere> topi1 = new ArrayList<>();
    private ArrayList<Object> curvee1 = new ArrayList<>();
    private ArrayList<Sphere> bambu1 = new ArrayList<>();

    //Kevin
    private ArrayList<Sphere> kepala2 = new ArrayList<>();
    private ArrayList<Sphere> badan2 = new ArrayList<>();
    private ArrayList<Sphere> kaki2 = new ArrayList<>();
    private ArrayList<Sphere> tangan2 = new ArrayList<>();
    private ArrayList<Sphere> topi2 = new ArrayList<>();
    private ArrayList<Object> kumis2 = new ArrayList<>();
    private ArrayList<Sphere> telinga2 = new ArrayList<>();
    boolean check1 = true;


    int countDegree = 0;
    Camera camera = new Camera();
    Projection projection = new Projection(window.getWidth(), window.getHeight());

    public void init() {
        window.init();
        GL.createCapabilities();
        camera.setPosition(0f, 0f, 3f);

        // Yuandi
        kepala.add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.5f,
                0.5f,
                0.5f, 360,
                180, 2));
        kepala.get(0).translateObject(0f, 0f, 0f);
        //white face
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.45f,
                0.45f,
                0.45f, 360,
                180, 2));
        kepala.get(0).getChildObject().get(0).translateObject(0f, -0.05f, 0.1f);
        kepala.get(0).getChildObject().get(0).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));

        //outline mata
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.12f,
                0.12f,
                0.14f, 36,
                18, 2));
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.12f,
                0.12f,
                0.14f, 36,
                18, 2));
        kepala.get(0).getChildObject().get(1).translateObject(-0.12f, 0.2f, 0.36f);
        kepala.get(0).getChildObject().get(2).translateObject(0.12f, 0.21f, 0.36f);
        kepala.get(0).getChildObject().get(1).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));
        kepala.get(0).getChildObject().get(2).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));

        //mata
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.1f,
                0.1f,
                0.12f, 360,
                180, 2));
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.1f,
                0.1f,
                0.12f, 360,
                180, 2));
        kepala.get(0).getChildObject().get(3).translateObject(-0.12f, 0.2f, 0.4f);
        kepala.get(0).getChildObject().get(4).translateObject(0.12f, 0.21f, 0.4f);
        kepala.get(0).getChildObject().get(3).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));
        kepala.get(0).getChildObject().get(4).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));

        //pupil
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0f, 0f, 0f),
                0.02f,
                0.02f,
                0.02f, 360,
                180, 2));
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0f, 0f, 0f),
                0.02f,
                0.02f,
                0.02f, 360,
                180, 2));
        kepala.get(0).getChildObject().get(5).translateObject(-0.08f, 0.2f, 0.52f);
        kepala.get(0).getChildObject().get(6).translateObject(0.08f, 0.2f, 0.52f);
        kepala.get(0).getChildObject().get(5).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));
        kepala.get(0).getChildObject().get(6).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));

        //nose
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.07f,
                0.07f,
                0.07f, 360,
                180, 2));
        kepala.get(0).getChildObject().get(7).translateObject(0f, 0.05f, 0.55f);
        kepala.get(0).getChildObject().get(7).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));

        //mulut
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.15f,
                0.05f,
                0.15f, 360,
                180, 2));
        kepala.get(0).getChildObject().get(8).translateObject(0f, -0.13f, 0.43f);
        kepala.get(0).getChildObject().get(8).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));

        //badan
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.45f,
                0.45f,
                0.6f, 360,
                180, 3));
        kepala.get(0).getChildObject().get(9).translateObject(0f, -0.4f, 0f);

        //badan putih
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.33f,
                0.4f,
                0.4f, 360,
                180, 2));

        kepala.get(0).getChildObject().get(10).translateObject(0f, -0.5f, 0.1f);

        //outline kantong ajaib

        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.35f,
                0.35f,
                0.35f, 360,
                180, 9));
        kepala.get(0).getChildObject().get(11).translateObject(0f, 0.9f, -0.525f);
        kepala.get(0).getChildObject().get(11).rotateObject(180f, 0f, 0f, 0f);

        //kantong ajaib
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.30f,
                0.30f,
                0.30f, 360,
                180, 9));
        kepala.get(0).getChildObject().get(12).translateObject(0f, 0.9f, -0.60f);
        kepala.get(0).getChildObject().get(12).rotateObject(180f, 0f, 0f, 0f);

        //kalung
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.4f,
                0.3f,
                0.1f, 360,
                180, 3));
        kepala.get(0).getChildObject().get(13).translateObject(0f, -0.29f, 0.24f);

        //lonceng
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 0.65f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.05f,
                0.05f,
                0.05f, 360,
                180, 2));
        kepala.get(0).getChildObject().get(14).translateObject(0f, -0.33f, 0.55f);


        //lengan
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.1f,
                0.15f,
                0.25f, 360,
                180, 3));

        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.1f,
                0.15f,
                0.25f, 360,
                180, 3));
        kepala.get(0).getChildObject().get(15).translateObject(-0.48f, -.5f, 0f);
        kepala.get(0).getChildObject().get(16).translateObject(0.48f, -.5f, 0f);

        //telapak tangan
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.11f,
                0.11f,
                0.11f, 360,
                180, 2));
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.11f,
                0.11f,
                0.11f, 360,
                180, 2));
        kepala.get(0).getChildObject().get(17).translateObject(-0.49f, -.73f, 0f);
        kepala.get(0).getChildObject().get(18).translateObject(0.49f, -.73f, 0f);

        //paha
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.2f,
                0.2f,
                0.25f, 360,
                180, 3));


        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.2f,
                0.2f,
                0.25f, 360,
                180, 3));
        kepala.get(0).getChildObject().get(19).translateObject(-0.2f, -0.9f, 0f);
        kepala.get(0).getChildObject().get(20).translateObject(0.2f, -0.9f, 0f);

        //telapak kaki
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.2f,
                0.2f,
                0.1f, 360,
                180, 3));
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.2f,
                0.2f,
                0.1f, 360,
                180, 3));
        kepala.get(0).getChildObject().get(21).translateObject(-0.21f, -1.2f, 0f);
        kepala.get(0).getChildObject().get(22).translateObject(0.21f, -1.2f, 0f);


        //kumis
        kepala.get(0).getChildObject().add(new Curve(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ), new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 0.0f)
                , Arrays.asList(0f, 0f, 0f)));
        kepala.get(0).getChildObject().get(23).addVertices(new Vector3f(-0.4f, -0.075f, 0.55f));
        kepala.get(0).getChildObject().get(23).addVertices(new Vector3f(-0.3f, 0.1f, 0.55f));
        kepala.get(0).getChildObject().get(23).addVertices(new Vector3f(-0.07f, -0.0225f, 0.55f));
        kepala.get(0).getChildObject().get(23).translateObject(0f, 0f, 0.5f);

        kepala.get(0).getChildObject().add(new Curve(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ), new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 0.0f)
                , Arrays.asList(0f, 0f, 0f)));
        kepala.get(0).getChildObject().get(24).addVertices(new Vector3f(-0.4f, -0.275f, 0f));
        kepala.get(0).getChildObject().get(24).addVertices(new Vector3f(-0.3f, 0.05f, 0f));
        kepala.get(0).getChildObject().get(24).addVertices(new Vector3f(-0.07f, -0.0425f, 0f));
        kepala.get(0).getChildObject().get(24).translateObject(0f, 0f, 0.5f);

        kepala.get(0).getChildObject().add(new Curve(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ), new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 0.0f)
                , Arrays.asList(0f, 0f, 0f)));
        kepala.get(0).getChildObject().get(25).addVertices(new Vector3f(0.4f, -0.075f, 0f));
        kepala.get(0).getChildObject().get(25).addVertices(new Vector3f(0.3f, 0.1f, 0f));
        kepala.get(0).getChildObject().get(25).addVertices(new Vector3f(0.07f, -0.0225f, 0f));
        kepala.get(0).getChildObject().get(25).translateObject(0f, 0f, 0.5f);

        kepala.get(0).getChildObject().add(new Curve(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ), new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 0.0f)
                , Arrays.asList(0f, 0f, 0f)));
        kepala.get(0).getChildObject().get(26).addVertices(new Vector3f(0.4f, -0.275f, 0f));
        kepala.get(0).getChildObject().get(26).addVertices(new Vector3f(0.3f, 0.05f, 0f));
        kepala.get(0).getChildObject().get(26).addVertices(new Vector3f(0.07f, -0.0425f, 0f));
        kepala.get(0).getChildObject().get(26).translateObject(0f, 0f, 0.5f);

        //topi
        kepala.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 0.65f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.1f,
                0.15f,
                0.15f, 360,
                180, 6));
        kepala.get(0).getChildObject().get(27).rotateObject((float) Math.toRadians(60.0), 0f, 0f, -0.5f);
        kepala.get(0).getChildObject().get(27).translateObject(-0.4f, 0.35f, 0f);




        //Timothy

        //head
        kepala1.add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.8f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.5f,
                0.5f,
                0.5f, 36,
                18, 3));

        kepala1.get(0).translateObject(-1.5f, -0.07f, 0f);


        //white face
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.45f,
                0.45f,
                0.5f, 36,
                18, 2));
        kepala1.get(0).getChildObject().get(0).translateObject(-1.5f, -0.05f, 0.1f);
//        kepala1.get(0).getChildObject().get(0).setCenterPoint(Arrays.asList(-1.5f, 0.0f, 0.0f));

        //line mata
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 0f),
                Arrays.asList(0f, 0f, 0f),
                0.11f,
                0.11f,
                0.13f, 36,
                18, 2));
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.11f,
                0.11f,
                0.13f, 36,
                18, 2));
        kepala1.get(0).getChildObject().get(1).translateObject(-1.62f, 0.2f, 0.41f);
        kepala1.get(0).getChildObject().get(2).translateObject(-1.38f, 0.21f, 0.41f);
//        kepala1.get(0).getChildObject().get(1).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));
//        kepala1.get(0).getChildObject().get(2).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));

        //mata
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.1f,
                0.1f,
                0.12f, 36,
                18, 2));
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.1f,
                0.1f,
                0.12f, 36,
                18, 2));
        kepala1.get(0).getChildObject().get(3).translateObject(-1.62f, 0.2f, 0.425f);
        kepala1.get(0).getChildObject().get(4).translateObject(-1.38f, 0.21f, 0.425f);
//        kepala1.get(0).getChildObject().get(3).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));
//        kepala1.get(0).getChildObject().get(4).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));

        //pupil
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0f, 0f, 0f),
                0.03f,
                0.03f,
                0.03f, 36,
                18, 2));
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0f, 0f, 0f),
                0.03f,
                0.03f,
                0.03f, 36,
                18, 2));
        kepala1.get(0).getChildObject().get(5).translateObject(-1.6f, 0.17f, 0.525f);
        kepala1.get(0).getChildObject().get(6).translateObject(-1.4f, 0.17f, 0.525f);
//        kepala1.get(0).getChildObject().get(5).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));
//        kepala1.get(0).getChildObject().get(6).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));

        //hidung
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.47f, 0.54f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.1f,
                -0.05f,
                0.1f, 36,
                18, 2));
        kepala1.get(0).getChildObject().get(7).translateObject(-1.5f, -0.065f, 0.6f);
//        kepala.get(0).getChildObject().get(7).setCenterPoint(Arrays.asList(0.25f, 0.0f, 0.0f));

        //badan
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.8f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.45f,
                0.45f,
                0.6f, 36,
                18, 3));
        kepala1.get(0).getChildObject().get(8).translateObject(-1.5f, -0.4f, 0f);

        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.33f,
                0.4f,
                0.4f, 108,
                72, 2));
        kepala1.get(0).getChildObject().get(9).translateObject(-1.5f, -0.5f, 0.125f);

        //kalung
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.3f, 0.93f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.275f,
                0.275f,
                0.45f, 36,
                18, 3));
        kepala1.get(0).getChildObject().get(10).translateObject(-1.5f, -0.25f, 0.25f);

        //lonceng
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 0.65f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.05f,
                0.05f,
                0.05f, 36,
                18, 3));
        kepala1.get(0).getChildObject().get(11).translateObject(-1.5f, -0.48f, 0.5f);


        //lengan
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.8f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.25f,
                0.1f,
                0.15f, 36,
                18, 3));

        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.8f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.1f,
                0.25f,
                0.25f, 36,
                18, 3));
        kepala1.get(0).getChildObject().get(12).translateObject(-2.135f, -.375f, 0f);
        kepala1.get(0).getChildObject().get(13).translateObject(-0.98f, -.5f, 0f);

        //telapak tangan
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.11f,
                0.11f,
                0.11f, 36,
                18, 3));
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.11f,
                0.11f,
                0.11f, 36,
                18, 3));
        kepala1.get(0).getChildObject().get(14).translateObject(-2.225f, -.375f, 0.1f);
        kepala1.get(0).getChildObject().get(15).translateObject(-0.99f, -.7f, 0.1f);

        //paha
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.8f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.2f,
                0.25f,
                0.25f, 36,
                18, 3));


        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.8f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.2f,
                0.25f,
                0.25f, 36,
                18, 3));
        kepala1.get(0).getChildObject().get(16).translateObject(-1.7f, -0.9f, 0f);
        kepala1.get(0).getChildObject().get(17).translateObject(-1.3f, -0.9f, 0f);

        //telapak kaki
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.2f,
                0.1f,
                0.1f, 36,
                18, 3));
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.2f,
                0.1f,
                0.1f, 36,
                18, 3));
        kepala1.get(0).getChildObject().get(18).translateObject(-1.75f, -1.1f, 0.1f);
        kepala1.get(0).getChildObject().get(19).translateObject(-1.25f, -1.1f, 0.1f);

        kepala1.get(0).getChildObject().add(new Curve(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ), new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 0.0f),
                Arrays.asList(0f,0f,0f,0.0f)));
        kepala1.get(0).getChildObject().get(20).addVertices(new Vector3f(-0.1f, -0.02f, 0.2f));
        kepala1.get(0).getChildObject().get(20).addVertices(new Vector3f(-0.025f, 0.025f, 0.2f));
        kepala1.get(0).getChildObject().get(20).addVertices(new Vector3f(0.1f, -0.01f, 0.2f));
        kepala1.get(0).getChildObject().get(20).translateObject(-1.5f, 0f, 0.6f);

        kepala1.get(0).getChildObject().add(new Curve(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ), new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 0.0f),
                Arrays.asList(0f,0f,0f,0.0f)));
        kepala1.get(0).getChildObject().get(21).addVertices(new Vector3f(-0.15f, -0.25f, 0.2f));
        kepala1.get(0).getChildObject().get(21).addVertices(new Vector3f(-0.025f, -0.4f, 0.2f));
        kepala1.get(0).getChildObject().get(21).addVertices(new Vector3f(0.15f, -0.25f, 0.2f));
        kepala1.get(0).getChildObject().get(21).translateObject(-1.5f, 0f, 0.525f);

        //baling bambu
        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.3f,
                0.05f,
                0.2f, 36,
                18, 2));
        kepala1.get(0).getChildObject().get(22).translateObject(-1.5f, 0.8f, 0.1f);

        kepala1.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.05f,
                0.375f,
                0.2f, 36,
                18, 1));
        kepala1.get(0).getChildObject().get(23).translateObject(-1.5f, 0.6f, 0.1f);




//        //kantong ajaib dalam
//
//        badan1.add(new Sphere(Arrays.asList(
//                new ShaderProgram.ShaderModuleData(
//                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//        ),
//                new ArrayList<>(
//                        List.of(
//                        )
//                ),
//                new Vector4f(0.0f, 0.0f, 0.0f, 0.0f),
//                Arrays.asList(0f, 0f, 0f),
//                0.32f,
//                0.32f,
//                0.32f, 108,
//                72, 9));
//        badan1.get(2).translateObject(-1.5f, 1.195f, 0.6f);
//        badan1.get(2).rotateObject(-90f, 0f, 0f, 0.6f);
//
//        //outline kantong ajaib
//        badan1.add(new Sphere(Arrays.asList(
//                new ShaderProgram.ShaderModuleData(
//                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
//                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
//        ),
//                new ArrayList<>(
//                        List.of(
//                        )
//                ),
//                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
//                Arrays.asList(0f, 0f, 0f),
//                0.30f,
//                0.30f,
//                0.30f, 108,
//                72, 9));
//        badan1.get(3).translateObject(-1.5f, 1.2f, 0.575f);
//        badan1.get(3).rotateObject(-90f, 0f, 0f, 0.575f);



        //Kevin

        //head
        kepala2.add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(.58f, .58f, .58f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.3f,
                0.3f,
                0.3f, 36,
                18, 2));
        kepala2.get(0).translateObject(1.5f, 0f, 0.1f);

        //mata
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.07f,
                0.1f,
                0.11f, 36,
                18, 2));
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 1.0f, 1.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.07f,
                0.1f,
                0.11f, 36,
                18, 2));
        kepala2.get(0).getChildObject().get(0).translateObject(1.41f, 0.07f, 0.3f);
        kepala2.get(0).getChildObject().get(1).translateObject(1.59f, 0.07f, 0.3f);

        //pupil
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0f, 0f, 0f),
                0.025f,
                0.028f,
                0.025f, 36,
                18, 2));
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                Arrays.asList(0f, 0f, 0f),
                0.025f,
                0.028f,
                0.025f, 36,
                18, 2));
        kepala2.get(0).getChildObject().get(2).translateObject(1.42f, 0.05f, 0.39f);
        kepala2.get(0).getChildObject().get(3).translateObject(1.58f, 0.05f, 0.39f);

        //nose
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(1.0f, 0.0f, 0.0f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.07f,
                0.05f,
                0.05f, 36,
                18, 2));
        kepala2.get(0).getChildObject().get(4).translateObject(1.5f, -0.09f, 0.39f);

        //telinga
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(.58f, 0.58f, 0.58f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.17f,
                0.17f,
                0.17f, 36,
                18, 2));
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(.58f, 0.58f, 0.58f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.17f,
                0.17f,
                0.17f, 36,
                18, 2));
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.47f, 0.54f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.13f,
                0.13f,
                0.13f, 36,
                18, 2));
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.47f, 0.54f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.13f,
                0.13f,
                0.13f, 36,
                18, 2));
        kepala2.get(0).getChildObject().get(5).translateObject(1.32f, 0.33f, 0.05f);
        kepala2.get(0).getChildObject().get(6).translateObject(1.68f, 0.33f, 0.05f);
        kepala2.get(0).getChildObject().get(7).translateObject(1.32f, 0.33f, 0.1f);
        kepala2.get(0).getChildObject().get(8).translateObject(1.68f, 0.33f, 0.1f);



        //badan
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.58f, 0.58f, 0.58f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.25f,
                0.25f,
                0.35f, 36,
                18, 3));
        kepala2.get(0).getChildObject().get(9).translateObject(1.5f, -0.3f, 0.1f);

        //lengan
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.58f, 0.58f, 0.58f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.06f,
                0.1f,
                0.16f, 36,
                18, 3));

        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.58f, 0.58f, 0.58f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.06f,
                0.1f,
                0.16f, 36,
                18, 3));
        kepala2.get(0).getChildObject().get(10).translateObject(1.25f, -.4f, 0.1f);
        kepala2.get(0).getChildObject().get(11).translateObject(1.75f, -.4f, 0.1f);

        //telapak tangan
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.47f, 0.54f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.05f,
                0.05f,
                0.05f, 36,
                18, 2));
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.47f, 0.54f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.05f,
                0.05f,
                0.05f, 36,
                18, 2));
        kepala2.get(0).getChildObject().get(12).translateObject(1.25f, -.55f, 0.15f);
        kepala2.get(0).getChildObject().get(13).translateObject(1.75f, -.55f, 0.15f);

        //paha
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.58f, 0.58f, 0.58f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.06f,
                0.1f,
                0.16f, 36,
                18, 3));


        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.58f, 0.58f, .58f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.06f,
                0.1f,
                0.16f, 36,
                18, 3));
        kepala2.get(0).getChildObject().get(14).translateObject(1.36f, -0.69f, 0.1f);
        kepala2.get(0).getChildObject().get(15).translateObject(1.64f, -0.69f, 0.1f);

        //telapak kaki
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.47f, 0.54f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.05f,
                0.05f,
                0.05f, 36,
                18, 3));
        kepala2.get(0).getChildObject().add(new Sphere(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ),
                new ArrayList<>(
                        List.of(
                        )
                ),
                new Vector4f(0.8f, 0.47f, 0.54f, 0.0f),
                Arrays.asList(0f, 0f, 0f),
                0.05f,
                0.05f,
                0.05f, 36,
                18, 3));
        kepala2.get(0).getChildObject().get(16).translateObject(1.36f, -.85f, 0.11f);
        kepala2.get(0).getChildObject().get(17).translateObject(1.64f, -.85f, 0.11f);


        //kumis
        kepala2.get(0).getChildObject().add(new Curve(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ), new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 0.0f)
                ,Arrays.asList(0f,0f,0f)));
        kepala2.get(0).getChildObject().get(18).addVertices(new Vector3f(-0.4f, -0.075f, 0.1f));
        kepala2.get(0).getChildObject().get(18).addVertices(new Vector3f(-0.3f, 0.1f, 0.1f));
        kepala2.get(0).getChildObject().get(18).addVertices(new Vector3f(-0.07f, -0.0225f, 0.1f));
        kepala2.get(0).getChildObject().get(18).translateObject(1.5f,0f,0.38f);

        kepala2.get(0).getChildObject().add(new Curve(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ), new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 0.0f)
                ,Arrays.asList(0f,0f,0f)));
        kepala2.get(0).getChildObject().get(19).addVertices(new Vector3f(-0.4f, -0.275f, 0.1f));
        kepala2.get(0).getChildObject().get(19).addVertices(new Vector3f(-0.3f, 0.05f, 0.1f));
        kepala2.get(0).getChildObject().get(19).addVertices(new Vector3f(-0.07f, -0.0425f, 0.1f));
        kepala2.get(0).getChildObject().get(19).translateObject(1.5f,0f,0.38f);

        kepala2.get(0).getChildObject().add(new Curve(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ), new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 0.0f)
                ,Arrays.asList(0f,0f,0f)));
        kepala2.get(0).getChildObject().get(20).addVertices(new Vector3f(0.4f, -0.075f, 0.1f));
        kepala2.get(0).getChildObject().get(20).addVertices(new Vector3f(0.3f, 0.1f, 0.1f));
        kepala2.get(0).getChildObject().get(20).addVertices(new Vector3f(0.07f, -0.0225f, 0.1f));
        kepala2.get(0).getChildObject().get(20).translateObject(1.5f,0f,0.38f);

        kepala2.get(0).getChildObject().add(new Curve(Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/shaders/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData("resources/shaders/scene.frag", GL_FRAGMENT_SHADER)
        ), new ArrayList<>(),
                new Vector4f(0f, 0f, 0f, 0.0f)
                ,Arrays.asList(0f,0f,0f)));
        kepala2.get(0).getChildObject().get(21).addVertices(new Vector3f(0.4f, -0.275f, 0.1f));
        kepala2.get(0).getChildObject().get(21).addVertices(new Vector3f(0.3f, 0.05f, 0.1f));
        kepala2.get(0).getChildObject().get(21).addVertices(new Vector3f(0.07f, -0.0425f, 0.1f));
        kepala2.get(0).getChildObject().get(21).translateObject(1.5f,0f,0.38f);
    }


    public void input() {
        //Yuandi
        //spinning
        if (window.isKeyPressed(GLFW_KEY_W)) {
            for (Sphere kepala : kepala) {
                List<Float> temp = new ArrayList<>(kepala.getCenterPoint());
                kepala.translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                kepala.rotateObject((float) Math.toRadians(0.5f), 0f, 1f, 0f);
                kepala.translateObject(temp.get(0), temp.get(1), temp.get(2));
            }
        }
        //Zoom
        if (window.isKeyPressed(GLFW_KEY_Q)) {
            for (Sphere kepala : kepala
            ) {
                kepala.translateObject(0.0f, -0.1f, 0f);
            }

        }
        if (window.isKeyPressed(GLFW_KEY_E)) {
            for (Sphere kepala : kepala
            ) {
                kepala.translateObject(0.0f, 0.1f, 0f);
            }

        }

        //ke kiri
        if (window.isKeyPressed(GLFW_KEY_A)) {
            for (Sphere kepala : kepala
            ) {
                kepala.translateObject(-0.1f, 0f, 0f);
            }
        }
        //ke kanan
        if (window.isKeyPressed(GLFW_KEY_D)) {
            for (Sphere kepala : kepala
            ) {
                kepala.translateObject(0.1f, 0f, 0f);
            }
        }
        //movement
        if (window.isKeyPressed(GLFW_KEY_Z)) {
            for (Sphere kepala : kepala) {
                List<Float> temp = new ArrayList<>(kepala.getCenterPoint());
                kepala.getChildObject().get(15).translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                kepala.getChildObject().get(17).translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                kepala.getChildObject().get(16).translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                kepala.getChildObject().get(18).translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                kepala.getChildObject().get(19).translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                kepala.getChildObject().get(21).translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                kepala.getChildObject().get(20).translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                kepala.getChildObject().get(22).translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                if (check) {
                    if (kepala.getChildObject().get(15).getCenterPoint().get(1) >= -0.47f) {
                        check = false;
                    } else {
                        //lengan kiri
                        kepala.getChildObject().get(15).rotateObject((float) Math.toRadians(0.5f), -1f, 0f, 0f);
                        kepala.getChildObject().get(17).rotateObject((float) Math.toRadians(0.5f), -1f, 0f, 0f);
                        //lengan kanan
                        kepala.getChildObject().get(16).rotateObject((float) Math.toRadians(0.5f), 1f, 0f, 0f);
                        kepala.getChildObject().get(18).rotateObject((float) Math.toRadians(0.5f), 1f, 0f, 0f);
                        //kaki kiri
                        kepala.getChildObject().get(19).rotateObject((float) Math.toRadians(0.5f), 1f, 0f, 0f);
                        kepala.getChildObject().get(21).rotateObject((float) Math.toRadians(0.5f), 1f, 0f, 0f);
                        //kaki kanan
                        kepala.getChildObject().get(20).rotateObject((float) Math.toRadians(0.5f), -1f, 0f, 0f);
                        kepala.getChildObject().get(22).rotateObject((float) Math.toRadians(0.5f), -1f, 0f, 0f);
                        System.out.println(kepala.getChildObject().get(15).getCenterPoint());
                    }
                } else {
                    if (kepala.getChildObject().get(15).getCenterPoint().get(1) <= -0.49f && kepala.getChildObject().get(15).getCenterPoint().get(2) <= -0.08f) {
                        check = true;
                    } else {
                        //lengan kiri
                        kepala.getChildObject().get(15).rotateObject((float) Math.toRadians(0.5f), 1f, 0f, 0f);
                        kepala.getChildObject().get(17).rotateObject((float) Math.toRadians(0.5f), 1f, 0f, 0f);
                        //lengan kanan
                        kepala.getChildObject().get(16).rotateObject((float) Math.toRadians(0.5f), -1f, 0f, 0f);
                        kepala.getChildObject().get(18).rotateObject((float) Math.toRadians(0.5f), -1f, 0f, 0f);
                        //kaki kiri
                        kepala.getChildObject().get(19).rotateObject((float) Math.toRadians(0.5f), -1f, 0f, 0f);
                        kepala.getChildObject().get(21).rotateObject((float) Math.toRadians(0.5f), -1f, 0f, 0f);
                        //kaki kanan
                        kepala.getChildObject().get(20).rotateObject((float) Math.toRadians(0.5f), 1f, 0f, 0f);
                        kepala.getChildObject().get(22).rotateObject((float) Math.toRadians(0.5f), 1f, 0f, 0f);

                        System.out.println(kepala.getChildObject().get(15).getCenterPoint());
                    }
                }
                kepala.getChildObject().get(15).translateObject(temp.get(0), temp.get(1), temp.get(2));
                kepala.getChildObject().get(17).translateObject(temp.get(0), temp.get(1), temp.get(2));
                kepala.getChildObject().get(16).translateObject(temp.get(0), temp.get(1), temp.get(2));
                kepala.getChildObject().get(18).translateObject(temp.get(0), temp.get(1), temp.get(2));
                kepala.getChildObject().get(19).translateObject(temp.get(0), temp.get(1), temp.get(2));
                kepala.getChildObject().get(21).translateObject(temp.get(0), temp.get(1), temp.get(2));
                kepala.getChildObject().get(20).translateObject(temp.get(0), temp.get(1), temp.get(2));
                kepala.getChildObject().get(22).translateObject(temp.get(0), temp.get(1), temp.get(2));
            }
        }


        //Timothy
        if (window.isKeyPressed(GLFW_KEY_R)) {
            for (Sphere kepala1 : kepala1) {
                List<Float> temp = new ArrayList<>(kepala1.getCenterPoint());
                kepala1.translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                kepala1.rotateObject((float) Math.toRadians(0.5f), 0f, 1f, 0f);
                kepala1.translateObject(temp.get(0), temp.get(1), temp.get(2));
            }
        }

        if (window.isKeyPressed(GLFW_KEY_G)) {
            for (Sphere kepala1 : kepala1
            ) {
                kepala1.translateObject(0.0f, -0.1f, 0f);
            }

        }
        if (window.isKeyPressed(GLFW_KEY_T)) {
            for (Sphere kepala1 : kepala1
            ) {
                kepala1.translateObject(0.0f, 0.1f, 0f);
            }

        }

        if (window.isKeyPressed(GLFW_KEY_X)) {
            camera.moveForward(0.1f);

        }
        if (window.isKeyPressed(GLFW_KEY_C)) {
            camera.moveBackwards(0.1f);
        }

        if (window.isKeyPressed(GLFW_KEY_F)) {
            for (Sphere kepala1 : kepala1
            ) {
                kepala1.translateObject(-0.1f, 0f, 0f);
            }

        }
        if (window.isKeyPressed(GLFW_KEY_H)) {
            for (Sphere kepala1 : kepala1
            ) {
                kepala1.translateObject(0.1f, 0f, 0f);
            }
        }


        //Kevin
        if (window.isKeyPressed(GLFW_KEY_I)) {


            for (Sphere kepala2 : kepala2
            ) {
                List<Float> temp = new ArrayList<>(kepala2.getCenterPoint());
                kepala2.translateObject(-temp.get(0), -temp.get(1), -temp.get(2));
                kepala2.rotateObject((float) Math.toRadians(0.5f), 0f, 1f, 0f);
                kepala2.translateObject(temp.get(0), temp.get(1), temp.get(2));
            }
        }
        if (window.isKeyPressed(GLFW_KEY_J)) {
            for (Sphere kepala2 : kepala2) {
                kepala2.translateObject(-0.1f, 0f, 0f);
            }
        }
        if (window.isKeyPressed(GLFW_KEY_L)) {
            for (Sphere kepala2 : kepala2) {
                kepala2.translateObject(0.1f, 0f, 0f);
            }
        }
        if (window.isKeyPressed(GLFW_KEY_U)) {
            for (Sphere kepala2 : kepala2
            ) {
                kepala2.translateObject(0.0f, -0.1f, 0f);
            }

        }
        if (window.isKeyPressed(GLFW_KEY_O)) {
            for (Sphere kepala2 : kepala2
            ) {
                kepala2.translateObject(0.0f, 0.1f, 0f);
            }

        }
    }





    public void loop() {
        while (window.isOpen()) {
            window.update();
            glClearColor(0.0f, 1.0f, 0.0f, 0.0f);
            GL.createCapabilities();

            input();

            //Yuandi
            for (Object kepala : kepala
            ) {
                if(kepala instanceof Curve) {
                    kepala.drawLine(camera, projection);
                }
                else{
                    kepala.draw(camera,projection);
                }
            }

            //Timothy
            for (Object kepala1 : kepala1
            ) {
                kepala1.draw(camera, projection);
            }


            //Kevin


            for (Object kepala2 : kepala2
            ) {
                kepala2.draw(camera, projection);
            }

            //Restore state
            glDisableVertexAttribArray(0);

            //Poll for window events.
            //The key callback above will only be
            //invoked during this call.
            glfwPollEvents();
        }
    }

    public void run() {
        init();
        loop();
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
