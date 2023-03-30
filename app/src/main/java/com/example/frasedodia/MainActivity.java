package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RadioButton piada;
    private RadioButton frase;
    private TextView txtNovafrase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNovafrase = findViewById(R.id.txtNovafrase);
        piada = findViewById(R.id.btnPiada);
        frase = findViewById(R.id.btnFrase);

    }

    public void nova_frase(View view) {
        List<String> frases = Arrays.asList(
                "A vida é um constante recomeço.",
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
                "Imagine uma nova história para sua vida e acredite nela.",
                "A felicidade é uma direção, não um destino.",
                "Não importa o que você decidiu. O que importa é que isso te faça feliz.",
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "Se você não pode explicar algo de forma simples, você não entendeu muito bem o que tem a dizer.",
                "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos.",
                "Que o vento leve o necessário e me traga o suficiente.",
                "Nenhum homem é uma ilha, completo em si mesmo; cada ser humano é uma parte do continente, uma parte da terra firme.",
                "O importante é nunca desistir, mesmo quando tudo parece difícil.",
                "O sucesso não é uma questão de sorte, é uma questão de perseverança e trabalho duro.",
                "Não espere pelas oportunidades, crie as suas próprias.",
                "O que define o seu sucesso não é o que você tem, mas sim o que você faz com o que tem.",
                "Não deixe que o medo o impeça de ser quem você realmente é.",
                "A melhor maneira de prever o futuro é criá-lo.",
                "Seja a mudança que você deseja ver no mundo.",
                "O tempo é o recurso mais valioso que temos, use-o sabiamente.",
                "A vida é como uma câmera: foque no que é importante, capture os bons momentos, desenvolva a partir dos negativos e, se algo não der certo, tire outra foto.",
                "Acredite em si mesmo e vá atrás dos seus sonhos.",
                "A gratidão transforma momentos comuns em dias de felicidade.",
                "A vida é curta demais para não ser vivida intensamente.",
                "Seja a mudança que você deseja ver no mundo.",
                "O importante não é chegar ao topo, mas sim aproveitar o caminho.",
                "A vida é um presente, aproveite cada momento.",
                "Não deixe que os seus medos o impeçam de realizar seus sonhos.",
                "Amar a si mesmo é o começo de um romance para toda a vida.",
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "Faça mais do que falar e crie mais do que consuma.",
                "A vida é uma jornada, aproveite cada passo.",
                "Se você não gosta de algo, mude. Se você não pode mudar, mude a sua atitude.",
                "A mudança começa quando alguém vê o próximo passo.",
                "A inspiração existe, mas ela tem que te encontrar trabalhando.",
                "Não há atalhos para qualquer lugar que valha a pena ir.",
                "Tudo é possível quando se tem coragem e determinação.",
                "Não deixe que os seus medos o impeçam de realizar seus", "Não espere por oportunidades, crie você mesmo as suas.",
                "Você é do tamanho do seu sonho.",
                "Não compense na ira o que lhe falta na razão.",
                "Defeitos e virtudes são apenas dois lados da mesma moeda.",
                "A maior de todas as torres começa no solo.",
                "Não há que ser forte. Há que ser flexível.",
                "Gente todo dia arruma os cabelos, por que não o coração?",
                "Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.",
                "A juventude não é uma época da vida, é um estado de espírito.",
                "Podemos escolher o que semear, mas somos obrigados a colher o que plantamos.",
                "Dê toda a atenção para a formação dos seus filhos, sobretudo por exemplos de sua própria vida.",
                "Siga os bons e aprenda com eles.",
                "Não importa o tamanho da montanha, ela não pode tapar o sol.",
                "O bom-senso vai mais longe do que muito conhecimento.",
                "Quem quer colher rosas deve estar preparado para suportar os espinhos.",
                "São os nossos amigos que nos ensinam as mais valiosas lições.",
                "Uma iniciativa mal-sucedida não significa o final de tudo. Sempre há uma nova oportunidade.",
                "Aquele que se importa com o sentimento dos outros, não é um tolo.",
                "A adversidade é um espelho que reflete o verdadeiro eu.",
                "Lamentar aquilo que não temos é desperdiçar aquilo que já possuímos.",
                "Uma bela flor é incompleta sem suas folhas.",
                "Sem o fogo do entusiasmo, não há o calor da vitória.",
                "Não há melhor negócio que a vida. A gente há obtém a troco de nada.",
                "O riso é a menor distância entre duas pessoas.",
                "Você é jovem apenas uma vez. Depois precisa inventar outra desculpa.",
                "É mais fácil conseguir o perdão do que a permissão.",
                "Os defeitos são mais fortes quando o amor é fraco.",
                "Amizade e Amor são coisas que podem virar uma só num piscar de olhos.",
                "Surpreender e ser surpreendido é o segredo do amor.",
                "Faça pequenas coisas agora e maiores coisas lhe serão confiadas cada dia.",
                "Todo mundo é capaz de denominar uma dor, exceto quem a sente.",
                "A paciência na adversidade é o sinal de um coração sensível.",
                "A vida é curta, aproveite cada momento.",
                "Não espere por oportunidades, crie-as.",
                "Faça o que você pode, com o que você tem, onde você está.",
                "Não deixe o medo te impedir de tentar.",
                "Não importa quantas vezes você cai, o importante é quantas vezes você se levanta.",
                "Aprenda com os erros do passado para construir um futuro melhor.",
                "Acredite em você mesmo e nada será impossível.",
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "Não espere que a vida seja perfeita para ser feliz.",
                "O que você faz hoje pode melhorar todos os seus amanhãs.",
                "Nunca é tarde demais para começar algo novo.",
                "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos.",
                "O otimismo é a chave para o sucesso.",
                "A melhor maneira de prever o futuro é criá-lo.",
                "Nada é impossível para aquele que persiste.",
                "Acredite em si mesmo e todo o resto se encaixa.",
                "A mudança começa com uma decisão.",
                "A verdadeira felicidade vem de dentro.",
                "Seja a mudança que você quer ver no mundo.",
                "Não se preocupe com o que os outros pensam, faça o que é certo.",
                "A vida é uma aventura, aproveite-a.",
                "Nunca é tarde demais para ser quem você poderia ter sido.",
                "O fracasso é apenas uma oportunidade para começar de novo com mais inteligência.",
                "Nunca desista, pois é a última chave do sucesso.",
                "Tudo é possível se você tiver coragem.",
                "Não deixe que as suas emoções controlem você.",
                "Não existe atalho para o sucesso.",
                "Não importa o que aconteça, mantenha a sua cabeça erguida.",
                "A felicidade não é algo pronto. Ela vem das suas próprias ações.",
                "Siga os seus sonhos, eles conhecem o caminho.",
                "O sucesso não é a chave para a felicidade. A felicidade é a chave para o sucesso.",
                "A vida é uma jornada, não um destino.",
                "Não há nada mais importante do que a sua paz interior.",
                "Você é o único responsável pela sua felicidade.",
                "Nunca deixe de aprender.",
                "O que não te mata, te faz mais forte.",
                "Acredite em você mesmo e no seu potencial.",
                "Você é capaz de muito mais do que imagina.",
                "A sua atitude determina a sua altitude."
        );

        List<String> piadas = Arrays.asList(
                "Por que a galinha atravessou a rua? Para chegar do outro lado!",
                "Por que o computador foi ao médico? Porque estava com vírus!",
                "Qual é o cumulo do azar? Ser atropelado por um carro funerário!",
                "O que é um pontinho vermelho no meio da sala? Uma mosca com um paletó!",
                "Por que o jacaré tirou o Facebook do ar? Para crocodilar!",
                "Qual é o animal que tem mais dentes? O pente!",
                "Por que a banana foi ao médico? Porque estava descascando!",
                "Qual é o contrário de volátil? Vem cá sobrinho!",
                "Por que a torre eiffel foi ao dentista? Para trocar os tártaros!",
                "O que um barbeiro falou para o cabelo? Vou cortar curto ou fazer de conta que corto?",
                "O que um pote de sorvete disse para o outro? Nossa, que sorvete legal!",
                "Qual é a fruta preferida dos astronautas? Uva gravitacional!",
                "O que o pato falou para a pata? Você é muito pata choca!",
                "Por que o Batman colocou o bat-móvel no seguro? Porque ele tem medo do Robin!",
                "Qual é o pássaro que está sempre na moda? O flamingo!",
                "O que a água disse para o açúcar? Você adoça a minha vida!",
                "Por que a música estava com frio? Porque estava em dó maior!",
                "Qual é a diferença entre o Sol e a Lua? A Lua não brilha tanto quanto o Sol, mas é muito mais fácil de pegar!",
                "Por que a abelha foi ao médico? Porque estava se sentindo zumbi!",
                "Qual é o carro mais limpo? O Fusca-lhão!",
                "O que a laranja falou para o limão? Você é um limão muito azedo!",
                "Por que o livro de matemática ficou triste? Porque tinha muitos problemas!",
                "Qual é o esporte preferido dos planetas? O gira-louco!",
                "O que um elétron falou para o outro? Acho que estamos sendo seguidos!",
                "Por que o tênis foi preso? Porque ele foi pego em flagrante delito!",
                "Qual é o nome do filme do surdo? Era uma vez um...",
                "O que é um ponto amarelo no meio da neve? Um pintinho de tênis!",
                "Por que a água foi presa? Porque matou a sede!",
                "Qual é o animal que sempre chega atrasado? O coelhado!",
                "O que uma impressora falou para outra? Essa folha é sua ou é impressão minha?",
                "Por que a melancia foi ao médico? Porque ela estava com melancolia!",
                "Qual é o animal mais rápido? A galinhada!",
                "O que o cavalo disse para o cavalo? Nada, cavalos não falam!",
                "Por que a formiga foi no oftalmologista? Porque ela não estava vendo nada!",
                "Qual é o contrário de volátil? Vem cá sobrinho!",
                "Por que o peixe é o animal mais inteligente? Porque ele nada de braçada!",
                "Por que o elefante é bom em informática? Porque ele tem muita memória!",
                "Qual é o país que mais parece um chuveiro? O Paraguai!",
                "Por que o peixe não gosta de emprestar dinheiro? Porque ele sempre fica sem troco!",
                "Por que a árvore foi ao banco? Para fazer uma transa-cão!",
                "Qual é o sapato que vai para o céu? A sandália da humildade!",
                "Por que o biscoito foi ao médico? Porque ele estava se sentindo um bolacha-trão!",
                "O que a fechadura disse para a chave? Você é a chave do meu coração!",
                "Qual é a fruta preferida do Papai Noel? A Noela!",
                "Por que o gato foi ao dentista? Porque ele tinha mau-hálito!",
                "Qual é o animal que tem o cabelo mais bonito? O xampu!",
                "Por que a galinha atravessou a rua de óculos escuros? Para não ser reconhecida!",
                "Qual é a música preferida dos astronautas? A space-cifick!",
                "Por que o avião não pode entrar no cinema? Porque ele tem asa-delta!",
                "Qual é a comida que é boa para o coração? O arroz-feijão!",
                "Por que o canguru não gosta de computador? Porque ele prefere o joysticanguru!",
                "Qual é o pássaro que está sempre sem dinheiro? O passarinho do fiado!",
                "Por que a bicicleta não tem namorado? Porque ela é muito ciclótica!",
                "Qual é o país mais veloz? Acorrida!",
                "Por que o polvo é um bom cozinheiro? Porque ele tem muitas mãos na massa!",
                "Qual é o objeto que tem a vida mais curta? A pilha!",
                "Por que o motorista do ônibus é um bom psicólogo? Porque ele sabe lidar com muitos passageiros!",
                "Qual é o animal que não toma banho? O chuveiro!",
                "Por que o cacto é um bom amigo? Porque ele sempre te abraça, mesmo quando você está espinhoso!",
                "Qual é o país que tem mais colinas? A Tchecos-lováquia!",
                "Por que o avião foi preso? Porque ele transportava um quilo de pó-lem!",
                "Qual é o melhor instrumento para tocar no mar? A bateria!",
                "Por que o pato foi demitido da loja de material de construção? Porque ele ficava batendo as asas e gritando: 'Quá-quá-quá-vede!'",
                "Qual é o animal que vive dentro do computador? O mouse!",
                "Por que a chave foi para a escola? Para aprender a ler!",
                "Qual é o prato preferido dos gatos? O ratatouille!",
                "Por que o cachorro não gosta de ler? Porque ele prefere au-ler!",
                "Qual é o animal que tem o melhor senso de humor? O bufão!"
        );

      if (!piada.isChecked()){
        int index1 = new Random().nextInt(frases.size());
        txtNovafrase.setText(frases.get(index1));
      }else {
          int index2 = new Random().nextInt(piadas.size());
          txtNovafrase.setText(piadas.get(index2));
      }
    }

}