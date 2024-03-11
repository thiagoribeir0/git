<html>
    <body>
        <p>Aula de PHP</p>

        <?php
            /*
            
            echo "olá mundo!<br/>";

            $cont = "<br/>O professor Patrick é o melhor!<br/>";

            echo $cont;
            echo "<br/>";

            $cont1 = 123;
            echo $cont1;
            echo "<br/>";

            echo "<br/>";
            $a = "Thiago";
            $b = "$a Barbosa";
            echo $b;
            echo "<br/>";

            $c= "Ribeiro";
            echo "<br/>";
            $d = $a." ".$c;
            echo $d;
            echo "<br/>";
            
            */

            /*
            $idade = 28;
            if($idade<12){
                echo "Você ainda é uma criança!";
            } else if ($idade>=12 && $idade <=35){
                echo "Você é jovem!";
            } else {
                echo "Você é um adulto!";
            }
            */

            
            $cont = 1;
            echo "<h3>Tabuada de 3</h3>";
            while($cont<=10){
                $valor = $cont*3;
                $cor="#b5b1b1";
                if ($cont%2==0){//se o número for par
                    $cor="#cccccc";
                }
                echo "<div style='background-color:$cor'>3 x $cont = $valor</div>";
                $cont++;
            }
            

            
        ?>

    </body>
</html>