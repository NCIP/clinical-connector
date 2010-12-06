CREATE OR REPLACE FUNCTION getDecrypt (
   p_in_val   VARCHAR2,
   p_key      VARCHAR2,
   p_iv       VARCHAR2 := NULL,
   p_which    NUMBER := 0      )
   RETURN VARCHAR2
IS
   l_dec_val   VARCHAR2 (2000);
   l_iv        VARCHAR2 (2000);
BEGIN
   IF p_which = 0
   THEN
      IF LENGTH (p_key) < 16
      THEN
         raise_application_error(-20001,'Key length less than 16 for two-pass scheme');
      END IF;
   ELSIF p_which = 1
   THEN
      IF LENGTH (p_key) < 24
      THEN raise_application_error(-20002,'Key length less than 24 for three-pass scheme');
      END IF;
   ELSE
      raise_application_error (-20003,'Incorrect value of which '|| p_which|| '; must be 0 or 1');
   END IF;

   l_iv := RPAD (p_iv, (8 * ROUND (LENGTH (p_iv) / 8, 0) + 8));
   
   l_dec_val :=  DBMS_OBFUSCATION_TOOLKIT.des3decrypt(input_string => UTL_RAW.cast_to_varchar2(HEXTORAW (p_in_val)),
                                                      key_string   => p_key,
                                                      iv_string    => l_iv,
                                                      which        => p_which);
   RETURN RTRIM (l_dec_val);
END;
/