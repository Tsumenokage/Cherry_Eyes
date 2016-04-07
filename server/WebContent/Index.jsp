<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="form.css" />
    </head>
    <body>
        <form method="post" action="Primitive">
            <fieldset>
                <legend>Primitives</legend>
                <p>Vous pouvez lancer des primitives avec ce formulaire.</p>

                <label for="adresse">Adresse IP du robot <span class="requis">*</span></label>
                <input type="text" id="adresse" name="adresse" value="" size="20" maxlength="60" />
                <br />

				<label for="port">Port du robot <span class="requis">*</span></label>
                <input type="text" id="port" name="port" value="" size="20" maxlength="60" />
                <br />

                <label for="primitive">Commande de la Primitive<span class="requis">*</span></label>
                <input type="text" id="primitive" name="primitive" value="" size="50" />
                <br />
                
                <label for="couleur">Couleur des yeux</label>
                <input type="test" id="color" name="color" value="" size="20"/>
                <br />
                
                 <label for="emotion">Émotions des yeux</label>
                <input type="test" id="mood" name="mood" value="" size="20"/>
                <br />
                
                

                <input type="submit" value="Execution" class="sansLabel" />
                <br />
            </fieldset>
        </form>
    </body>
</html>