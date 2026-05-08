# Pràctica DOO Gestió Bancària

Projecte Java per al Disseny Orientat a Objectes (DOO) d'una aplicació bancària.

## Estructura

- `src/main/java/com/bancgestio/model/` - classes del model de domini
- `src/test/java/` - proves de unitat existents
- `diagrams/` - diagrames UML i fitxers de suport
- `documentation/javadoc/` - documentació generada per JavaDoc

## Classes principals

- `Persona`, `Client`, `Empleat`, `Sucursal`
- `Compte`, `CompteCorrent`, `CompteTermini`
- `TargetaCredit`, `FonsInversio`, `Valor`, `CarteraValors`
- `FactoriaComptes`

## Com generar i compilar

1. Compilar projecte:
   ```bash
   mvn clean compile
   ```

2. Generar JavaDoc a `documentation/javadoc`:
   ```bash
   mvn javadoc:javadoc -DdestDir=documentation/javadoc
   ```

## Notes

- No cal implementar tota la lògica de negoci; els classes estan creats com a esquelet amb relacions i JavaDoc.
- Afegir els diagrames UML a la carpeta `diagrams/` un cop estiguin dibuixats.
