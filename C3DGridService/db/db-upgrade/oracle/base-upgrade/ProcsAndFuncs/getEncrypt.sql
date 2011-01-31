CREATE OR REPLACE FUNCTION getEncrypt (
   p_in_val   IN   VARCHAR2,
   p_key      IN   VARCHAR2,
   p_iv       IN   VARCHAR2 := NULL,
   p_which    IN   NUMBER := 0
)
   RETURN VARCHAR2
IS
   l_enc_val   VARCHAR2 (200);
   l_in_val    VARCHAR2 (200);
   l_iv        VARCHAR2 (200);
BEGIN
   IF p_which = 0
   THEN
      IF LENGTH (p_key) < 16
      THEN
         raise_application_error
                               (-20001,
                                'Key length less than 16 for two-pass scheme'
                               );
      END IF;
   ELSIF p_which = 1
   THEN
      IF LENGTH (p_key) < 24
      THEN
         raise_application_error
                             (-20002,
                              'Key length less than 24 for three-pass scheme'
                             );
      END IF;
   ELSE
      raise_application_error (-20003,
                                  'Incorrect value of which '
                               || p_which
                               || '; must be 0 or 1'
                              );
   END IF;

   l_in_val := RPAD (p_in_val, (8 * ROUND (LENGTH (p_in_val) / 8, 0) + 8));
   l_iv := RPAD (p_iv, (8 * ROUND (LENGTH (p_iv) / 8, 0) + 8));
   l_enc_val :=
      DBMS_OBFUSCATION_TOOLKIT.des3encrypt (input_string      => l_in_val,
                                            key_string        => p_key,
                                            iv_string         => l_iv,
                                            which             => p_which
                                           );
   l_enc_val := RAWTOHEX (UTL_RAW.cast_to_raw (l_enc_val));
   RETURN l_enc_val;
END;
/

